package com.acme.edu;

/**
 * print string
 */
public class StringMessage {
    public static String str = "string: ";

    public static void strMessage(String message) {
        Message.systemOut(str + message);
    }
}
