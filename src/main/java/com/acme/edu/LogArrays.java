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
        Message.systemOut(arr + sss);
    }

    public static void matrix(int[][] message) {
        Message.systemOut(matr);
        for (int i = 0; i < message.length ; i++) {
            Message.systemPrint("{");
            for (int j = 0; j < message.length ; j++) {
                Message.systemPrint(message[i][j]);
                if (j != message.length - 1) {
                    Message.systemPrint(", ");
                }
            }
            Message.systemOut("}");
        }
        Message.systemOut("}");
    }
}
