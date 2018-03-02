package com.acme.edu;

import java.util.Arrays;

/**
 * Print arrays
 */

public class LogArrays {
    public static String arr = "primitives array: ";
    public static String matr = "primitives matrix: {";

    public static void Array(int[] message) {
        String ss = Arrays.toString(message);
        String sss = ss.replace('[', '{').replace(']', '}');
        PrintToConsole.systemOut(arr + sss);
    }

    public static void Matrix(int[][] message) {
        PrintToConsole.systemOut(matr);
        for (int i = 0; i < message.length ; i++) {
            PrintToConsole.systemPrint("{");
            for (int j = 0; j < message.length ; j++) {
                PrintToConsole.systemPrint(message[i][j]);
                if (j != message.length - 1) {
                    PrintToConsole.systemPrint(", ");
                }
            }
            PrintToConsole.systemOut("}");
        }
        PrintToConsole.systemOut("}");
    }
}
