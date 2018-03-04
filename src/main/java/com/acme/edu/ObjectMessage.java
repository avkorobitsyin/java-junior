package com.acme.edu;

/**
 * Created by avkor on 04.03.2018.
 */
public class ObjectMessage {
    public static String ref = "reference: ";
    public static String sob = "/n@";

    public static void objMessage(Object message) {
        Message.systemOut(ref + message + sob + message);
    }
}
