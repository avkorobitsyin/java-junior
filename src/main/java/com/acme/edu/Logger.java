package com.acme.edu;


/**
 * Displays message to the console
 */
public class Logger {

    public static void log(char message) {
        Message m = new CharMessage();
        m.printMessage(message);
    }

    public static void log(byte message) {
        Message m = new PrrimitiveMesage();
        m.printMessage(message);
    }

    public static void log(boolean message) {
        Message m = new PrrimitiveMesage();
        m.printMessage(message);
    }

    public static void log(Object message) {
        Message m = new ObjectMessage();
        m.printMessage(message);
    }

    public static void log(int[] message) {
        Message m = new ArraysMesage();
        m.printMessage(message);
    }

    public static void log(int[][] message) {
        Message m = new MatrixMesage();
        m.printMessage(message);
    }

    public static void log(int message) {
        Message m = new IntAccumulatedMessage();
        m.printMessage(message);
    }

    public static void log(String message) {
        Message m = new StringAccumulatedMessage();
        m.printMessage(message);
    }

}
