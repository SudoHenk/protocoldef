/**
 * TraceReader: a small library that can read traces generated from the DSL, and converts this into messages that can bring the SUT in the correct state.
 */
#include <stdio.h>
#include <string.h>

/**
 * There exist 4 commands:
 * send <filename>      : send the exact bytes in the given file.
 * receive <filename>   : expect the exact bytes given in the file.
 * sendMessage <name>   : send a message with that given header/content.
 * receiveMessage <name>: expect a buffer with the given message name in it.
 */
enum TraceFileCommandType{SendFile, ReceiveFile, SendMessage, ReceiveMessage};

/**
 * Conversion struct.
 */
const static struct {
    enum TraceFileCommandType      val;
    const char *str;
} enumConversion [] = {
        {SendFile, "sendFile"},
        {ReceiveFile, "receiveFile"},
        {SendMessage, "sendMessage"},
        {ReceiveMessage, "receiveMessage"},
};

/**
 * Struct containing all the instructions from the tracefile.
 */
struct TraceFileCommand {
    enum TraceFileCommandType cmd;
    char* argument;
} traceFileCommandList[4096];

int currentReaderStep, maxSteps;

enum TraceFileCommandType convertStrToEnum(const char *str)
{
    int j;
    for (j = 0;  j < sizeof (enumConversion) / sizeof (enumConversion[0]);  ++j) {
        if (!strcmp (str, enumConversion[j].str)) {
            return enumConversion[j].val;
        }
    }
    return SendFile;
}

/**
 * Load the tracefile into the struct
 * @param traceFilename
 * @return status
 */
int loadTraceFile(char *traceFilename) {
    FILE *fh = NULL;
    char line[256];
    int i = 0;

    fh = fopen(traceFilename, "r");
    if(fh == NULL){
        printf("[ERROR] Could not load tracefile.\n");
        return -1;
    }
    printf("Reading tracefile");

    char commandName[20] = "";
    char commandArgument[120] = "";
    while(fgets(line, sizeof(line), fh)) {
        if((sscanf(line, "%19s %119[^\n]", commandName, commandArgument)) == 2) {
            traceFileCommandList[i].cmd = convertStrToEnum(commandName);
            traceFileCommandList[i].argument = strdup(commandArgument);
            i = i+1;
        }
    }
    fclose(fh);
    maxSteps = i;
    return 0;
}

/**
 * Setup the trace reader; converts the tracefile into packets which can be sent over to a library/application.
 * @param traceFilename the filename of the trace file.
 * @return status
 */
int setupTraceReader(char* traceFilename) {
    int result = loadTraceFile(traceFilename);
    if(result == -1) {
        return -1;
    }
    currentReaderStep = 0;
    return 0;
}

/**
 * Reads a given filename and passes it to the callback function.
 * @param fileName the file to read
 * @param callback the callback function to pass the buffer to.
 */
void readFileIntoCallback(char* fileName, void (*callback)()) {
    FILE *fh;
    unsigned char buf[4096];
    int bufSize;
    fh = fopen(fileName, "rb");
    if(fh != NULL) {
        bufSize = fread(buf, 1, 4096, fh);
        callback(buf, bufSize);
    } else {
        printf("[ERROR] Incorrect parameter, was expecting location to a file.\n");
    }
}

// TODO
int doTraceReaderStep(void (*sendFileCallback)(), void (*receiveFileCallback)()) {
    struct TraceFileCommand currCmd = traceFileCommandList[currentReaderStep];
    printf("TraceReader step: %d\n", currentReaderStep);
    switch(currCmd.cmd) {
        case SendFile:
            readFileIntoCallback(currCmd.argument, sendFileCallback);
            break;
        case ReceiveFile:
            readFileIntoCallback(currCmd.argument, receiveFileCallback);
            break;
        case SendMessage:
            // TODO
            break;
        case ReceiveMessage:
            // TODO
            break;
    }

    currentReaderStep += 1;
    if(currentReaderStep >= maxSteps) {
        return -1;
    }
    return 0;
}
