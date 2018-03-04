package com.acme.edu;

/**
 * print reference
 */
public class ObjectMessage {
    public static String ref = "reference: ";
    public static String sob = "/n@";

    public static void objMessage(Object message) {
        Message.systemOut(ref + message + sob + message);
    }
}
