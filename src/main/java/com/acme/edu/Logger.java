package com.acme.edu;


import java.util.Arrays;

/**
 * Displays message to the console
 */
public class Logger {
    private static String prim = "primitive: ";
    private static String chr = "char: ";
    private static String str = "string: ";
    private static String ref = "reference: ";
    private static String sob = "/n@";
    private static String arr = "primitives array: ";
    private static String matr = "primitives matrix: {";
    private static int count = 0;
    private static int sum = 0;
    private static String lastmessage = "";

    private static void systemOut(Object s) {
        System.out.println(s);
    }
    private static void systemOut(String s) {
        System.out.println(s);
    }


    public static void log(int message) {
        systemOut(prim + message);
        sum += message;
        systemOut(sum);
    }


    public static void log(char message) {
        systemOut(chr + message);
    }

    public static void log(byte message) {
        systemOut(prim + message);
    }

    public static void log(String message) {
        systemOut(str + message);
        if (!message.equals(lastmessage) && !lastmessage.equals("")) {
            count = 1;
        }
        else {
            count++;
        }
        lastmessage = message;
        systemOut(message + " (x"+count+")");
    }

    public static void log(boolean message) {
        systemOut(prim + message);
    }

    public static void log(Object message) {
        systemOut(ref + message + sob + message);
    }

    public static void log(int[] message) {
        String ss = Arrays.toString(message);
        String sss = ss.replace('[', '{').replace(']', '}');
        systemOut(arr + sss);
    }

    public static void log(int[][] message) {
        String ss = Arrays.toString(message);
        String sss = ss.replace('[', '{').replace(']', '}');
        systemOut(matr);
        systemOut(sss);
        systemOut("}");
    }
}
