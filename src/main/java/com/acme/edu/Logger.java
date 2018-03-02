package com.acme.edu;


import java.util.Arrays;

/**
 * Displays message to the console
 */
public class Logger {
    public static String prim = "primitive: ";
    public static final String chr = "char: ";
    public static String ref = "reference: ";
    public static String sob = "/n@";


    public static void log(char message) {
        PrintToConsole.systemOut(chr + message);
    }

    public static void log(byte message) {
        PrintToConsole.systemOut(prim + message);
    }

    public static void log(boolean message) {
        PrintToConsole.systemOut(prim + message);
    }

    public static void log(Object message) {
        PrintToConsole.systemOut(ref + message + sob + message);
    }

    public static void log(int[] message) {
        LogArrays.Array(message);
    }

    public static void log(int[][] message) {
        LogArrays.Matrix(message);
    }
    public static void log(int message) {
        Count.sum(message);
    }

    public static void log(String message) {
        Count.countMes(message);
    }

}
