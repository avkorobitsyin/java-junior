package com.acme.edu.client;

import com.acme.edu.formater.PrefixFormatVisitor;
import com.acme.edu.message.*;
import com.acme.edu.logger.*;

    public class Proxy {
    private static Connector connector = new Connector();
    private static LoggerController loggerController = new LoggerController(System.out::println, new PrefixFormatVisitor());

    public static void flush() {
        loggerController.flush();
    }

    public static void log(char message) {
        Message mes = new CharMessage(message);
        connector.sendMessage(mes);
    }

    public static void log(byte message) {
        Message mes = new ByteMessage(message);
        connector.sendMessage(mes);
    }

    public static void log(boolean message) {
        Message mes = new BooleanMessage(message);
        connector.sendMessage(mes);
    }

    public static void log(Object message) {
        Message mes = new ObjectMessage(message);
        connector.sendMessage(mes);
    }

    public static void log(int[] message) {
        Message mes = new ArraysMesage(message);
        connector.sendMessage(mes);
    }

    public static void log(int[][] message) {
        Message mes = new MatrixMesage(message);
        connector.sendMessage(mes);
    }

    public static void log(int message) {
        Message mes = new IntAccumulatedMessage(message);
        connector.sendMessage(mes);
    }

    public static void log(String message) {
        Message mes = new StringAccumulatedMessage(message);
        connector.sendMessage(mes);
    }
}