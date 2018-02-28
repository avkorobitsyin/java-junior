package com.acme.edu;

/**
 * Displays message to the console
 */
public class Logger {
    public static void systemOut(String s) {
        System.out.println(s);
    }

    public static void log(int message) {
        systemOut("primitive: " + message);
    }

    public static void log(char message) {
        systemOut("char: " + message);
    }

    public static void log(byte message) {
        systemOut("primitive: " + message);
    }

    public static void log(String message) {
        systemOut("string: " + message);
    }

    public static void log(boolean message) {
        systemOut("primitive: " + message);
    }

    public static void log(Object message) {
        systemOut("reference: " + message + "/n" + "@" + message);
    }

}
