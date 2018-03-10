package com.acme.edu.logger;


import com.acme.edu.formater.PrefixFormatVisitor;
import com.acme.edu.message.*;
import com.acme.edu.printer.ConsolePrinter;

/**
 * Displays message to the console
 */
public class Logger {
    private static LoggerController loggerController = new LoggerController(new ConsolePrinter(),
            new PrefixFormatVisitor());
    public static void flush() {
        loggerController.flush();
    }

    public static void log(char message) {
        Message mes = new CharMessage(message);
        loggerController.loggerMessage(mes);
    }

    public static void log(byte message) {
        Message mes = new ByteMessage(message);
        loggerController.loggerMessage(mes);
    }

    public static void log(boolean message) {
        Message mes = new BooleanMessage(message);
        loggerController.loggerMessage(mes);
    }

    public static void log(Object message) {
        Message mes = new ObjectMessage(message);
        loggerController.loggerMessage(mes);
    }

    public static void log(int[] message) {
        Message mes = new ArraysMesage(message);
        loggerController.loggerMessage(mes);
    }

    public static void log(int[][] message) {
        Message mes = new MatrixMesage(message);
        loggerController.loggerMessage(mes);
    }

    public static void log(int message) {
        Message mes = new IntAccumulatedMessage(message);
        loggerController.loggerMessage(mes);
    }

    public static void log(String message) {
        Message mes = new StringAccumulatedMessage(message);
        loggerController.loggerMessage(mes);
    }

}
