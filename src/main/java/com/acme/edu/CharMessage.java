package com.acme.edu;

/**
 * Print char
 */
public class CharMessage {
    public static String chr = "char: ";

    public static void charMessage(char message) {
        Message.systemOut(chr + message);
    }
}
