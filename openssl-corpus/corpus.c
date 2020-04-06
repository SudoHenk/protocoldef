/**
 * OpenSSL Corpus which can be fed traces from an DSL
 * to perform fuzzing in different states in the protocol
 *
 * Note that this needs the OpenSSl version compiled in the subdirectories.
 * See notes.txt to compile these targets first.
 *
 * Corpus was made with the help of SelfTLS and LibFuzzer.
 */

#include <assert.h>
#include "traceReader.c"
#include "helperFunctions.c"
#include "openssl-OpenSSL_1_0_1f/include/openssl/ssl.h"
#include "openssl-OpenSSL_1_0_1f/include/openssl/err.h"


void printOpenSSLError()
{
    ERR_print_errors_fp(stderr);
    exit(1);
}

SSL *server;
BIO *sinbio, *soutbio;
int result;

/**
 * Trigger the OpenSSL to read the input buffer and process the message(s).
 *
 * In case the handshake has not been completed, a different code flow is present compared to the normal SSL_read/write
 */
void doOpenSSLServerReadBuffer() {
    if(!SSL_is_init_finished(server)) {
        result = SSL_do_handshake(server);
        if(result == -1 && SSL_get_error(server, result) != SSL_ERROR_WANT_WRITE && SSL_get_error(server, result) != SSL_ERROR_WANT_READ) {
            printOpenSSLError();
        }
        printf("OpenSSL State: %s\n", SSL_state_string_long(server));
    } else {
        int pending, count = 0;
        unsigned char buf[9000];
        do {
            pending = SSL_pending(server);
            printf("pending application data: %d\n", pending);
            // use SSL_read_early_data ?
            result = SSL_read(server, buf, pending);
            if (result == -1 && SSL_get_error(server, result) != SSL_ERROR_WANT_WRITE &&
                SSL_get_error(server, result) != SSL_ERROR_WANT_READ && SSL_get_error(server, result) != SSL_ERROR_SYSCALL) {
                printf("ERROR: %d\n", SSL_get_error(server, result));
                printOpenSSLError();
            }
            if(pending > 0) {
                printf("Received application data:\n");
                printHex(buf, pending);
            } else {
                result = SSL_do_handshake(server);
            }
            result = BIO_read(soutbio, buf, 4096);
            if(result > 0) {
                printf("Server buffer out:\n");
                printHex(buf, result);
                storeBufToFile(buf, result, "p-server-test-1");
            }
            count++;
        } while(pending == 0 && count < 10);
    }
}

/**
 * Callback handler for the trace reader
 * @param expectedBuf the buffer we expect to receive from the SUT
 * @param expectedBufSize the size of the buffer
 */
void receiveFileCallback(unsigned char expectedBuf[4096], int expectedBufSize) {
    unsigned char buf[4096];
    result = BIO_read(soutbio, buf, 4096);
    if(result == -1) {
        printOpenSSLError();
    }
    if(memcmp(buf, expectedBuf, expectedBufSize) != 0) {
        printf("Expected message:\n");
        printHex(expectedBuf, expectedBufSize);
        storeBufToFile(buf, result, "p-res-client-hello-ext");
        printf("But got instead message: \n");
        printHex(buf, result);
        exit(1);
    } else {
        printf("Received correct response from SUT.\n");
    }
}

/**
 * Callback handler for the trace reader
 * @param buf the buffer we must send to the SUT
 * @param bufSize the size of the buffer
 */
void sendFileCallback(unsigned char buf[4096], int bufSize) {
    BIO_write(sinbio, buf, bufSize);
    doOpenSSLServerReadBuffer();
}

/**
 * Callback for the OpenSSL library on new session ticket creation.
 */
static int sslTlsextTicketKeyCallback(SSL *s, unsigned char key_name[16], unsigned char *iv, EVP_CIPHER_CTX *ctx, HMAC_CTX *hctx, int enc) {
    EVP_EncryptInit_ex(ctx, EVP_enc_null(), NULL, NULL, NULL);
    HMAC_Init_ex(hctx, NULL, 0, EVP_md_null(), NULL);
    return 1;
}

/**
 * Callback for session identifiers.
 */
const char *sessionId = "AAAAAAAAAAAAAAAAAAAAAAAA";
static int generateSessionId(const SSL *ssl, unsigned char *id,
                               unsigned int *id_len)
{
    memcpy(id, sessionId, (strlen(sessionId) < *id_len) ?
                          strlen(sessionId) : *id_len);
    return 1;
}

int main(int argc, char **argv)
{
    printHeader("OpenSSL Corpus");

    char *traceFilename, *inputFilename;
    FILE *inputFile;
    unsigned char buf[4096];
    int bufSize;

    if(argc > 2) {
        traceFilename = argv[1];
        inputFilename = argv[2];
        printf("Trace file: %s \nInput file: %s\n===============\n", traceFilename, inputFilename);
    } else {
        printf("Usage: ./openssl_corpus <trace_file> <fuzzer_input_file>");
        exit(1);
    }

    /**
     * Initialize library
     */

    SSL_library_init();
    SSL_load_error_strings();
    ERR_load_BIO_strings();
    OpenSSL_add_all_algorithms();

    SSL_CTX *sctx;

    /**
     * Setup OpenSSL Server handler.
     */

    assert(sctx = SSL_CTX_new(TLSv1_2_method()));
    // Only allow null ciphers, as we don't want to test the encryption.
    SSL_CTX_set_cipher_list(sctx, "NULL");
    // Make sure a session ticket is always deterministic
    SSL_CTX_set_options(sctx, SSL_OP_NO_TICKET);
    SSL_CTX_set_tlsext_ticket_key_cb(sctx, &sslTlsextTicketKeyCallback);
    SSL_CTX_set_generate_session_id(sctx, &generateSessionId);

    assert(SSL_CTX_use_certificate_file(sctx, "server.pem", SSL_FILETYPE_PEM));
    assert(SSL_CTX_use_PrivateKey_file(sctx, "server.key", SSL_FILETYPE_PEM));

    server = SSL_new(sctx);

    sinbio = BIO_new(BIO_s_mem());
    soutbio = BIO_new(BIO_s_mem());

    SSL_set_bio(server, sinbio, soutbio);
    SSL_set_accept_state(server);

    /**
     * Transition to the correct state in the protocol
     */
    result = setupTraceReader(traceFilename);
    if(result == -1) {
        printf("Trace reader could not start.");
        exit(1);
    }

    while(doTraceReaderStep(&sendFileCallback, &receiveFileCallback) != -1) {
    }
    printf("Final state before fuzzer: %s\n", SSL_state_string_long(server));


    /**
     * Fuzzing checkpoint and input for AFL.
     */
#ifdef __AFL_HAVE_MANUAL_CONTROL
    __AFL_INIT();
#endif

    inputFile = fopen(inputFilename, "rb");
    bufSize = fread(buf, 1, 4096, inputFile);
    BIO_write(sinbio, buf, bufSize);

    doOpenSSLServerReadBuffer();

    SSL_free(server);
    return 0;
}