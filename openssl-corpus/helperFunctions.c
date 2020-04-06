/**
 * Helper functions used in the corpus
 */

/**
 * Print a header to stdout
 * @param head the title
 */
void printHeader(char* head)
{
    printf("=================\n");
    printf("%s\n", head);
    printf("=================\n");
}

/**
 * Store a buffer in a given filename.
 * @param pointer the buffer
 * @param size size of the buffer
 * @param filename filename to store it in.
 */
void storeBufToFile(void *pointer, int size, char *filename) {
    FILE *fh = fopen(filename, "wb");
    fwrite(pointer, 1, size, fh);
    fclose(fh);
}

/**
 * Print a buffer as HEX values
 * @param pointer buffer
 * @param size size of the buffer
 */
void printHex(void *pointer, int size) {
    int i;
    unsigned char *p = (unsigned char *)pointer;
    for (i=0;i<size;i++) {
        if (i % 16 == 0 && i) {
            printf("\n");
        }
        printf("0x%02x ", p[i]);
    }
    printf("\n");
}