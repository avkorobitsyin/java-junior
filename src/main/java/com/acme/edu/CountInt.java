package com.acme.edu;

/**
 * Print sumString and SumInt
 */

public class CountInt extends Logger {
    private static int sum = 0;

    public static void sum(int message) {
        PrintToConsole.systemOut(prim + message);
        sum += message;
        PrintToConsole.systemOut(sum);
    }

}
