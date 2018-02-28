package com.acme.edu;

/**
 * Displays message to the console
 */
public class Logger {
    private static String prim = "primitive: ";
    private static String chr = "char: ";
    private static String str = "string: ";
    private static String ref = "reference: ";
    private static String sob = "/n@";

    private static void systemOut(Object s) {
        System.out.println(s);
    }
    public static void zero() {

    }

    public static void log(int message) {
        systemOut(prim + message);
        message += message - 1;
        systemOut(message);
    }


    public static void log(char message) {
        systemOut(chr + message);
    }

    public static void log(byte message) {
        systemOut(prim + message);
    }

    public static void log(String message) {
        systemOut(str + message);
        int count = 0;
        if (message.equals(message)) {
            count++;
        }
        systemOut(message + "(x"+count+")");
    }

    public static void log(boolean message) {
        systemOut(prim + message);
    }

    public static void log(Object message) {
        systemOut(ref + message + sob + message);
    }

}
