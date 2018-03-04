package com.acme.edu;

/**
 * Created by avkor on 04.03.2018.
 */
public class CharMessage {
    public static String chr = "char: ";

    public static void charMessage(char message) {
        Message.systemOut(chr + message);
    }
}
