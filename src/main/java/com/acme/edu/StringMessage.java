package com.acme.edu;

/**
 * Created by avkor on 04.03.2018.
 */
public class StringMessage {
    public static String str = "string: ";

    public static void strMessage(String message) {
        Message.systemOut(str + message);
    }
}
