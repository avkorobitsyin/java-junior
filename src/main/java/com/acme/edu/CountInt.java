package com.acme.edu;

/**
 * Print sumString and SumInt
 */

public class CountInt extends Logger {
    private static int sum = 0;

    public static void sum(int message) {
        PrrimitiveMesage.primMessage(message);
        sum += message;
        Message.systemOut(sum);
    }

}
