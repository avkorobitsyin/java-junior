package com.acme.edu;


/**
 * Displays message to the console
 */
public class Logger {

    public static void log(char message) {
        CharMessage.charMessage(message);
    }

    public static void log(byte message) {
        PrrimitiveMesage.primMesage(message);
    }

    public static void log(boolean message) {
        PrrimitiveMesage.primMessage(message);
    }

    public static void log(Object message) {
        ObjectMessage.objMessage(message);
    }

    public static void log(int[] message) {
        LogArrays.Array(message);
    }

    public static void log(int[][] message) {
        LogArrays.matrix(message);
    }
    public static void log(int message) {
        CountInt.sum(message);
    }

    public static void log(String message) {
        CountString.countMes(message);
    }

}
