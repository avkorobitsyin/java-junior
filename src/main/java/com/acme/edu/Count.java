package com.acme.edu;

/**
 * Print sumString and SumInt
 */

public class Count {
    private static int count = 0;
    private static int sum = 0;
    private static String lastmessage = "";
    private static String str = "string: ";
    public static String prim = "primitive: ";

    public static void sum(int message) {
        PrintToConsole.systemOut(prim + message);
        sum += message;
        PrintToConsole.systemOut(sum);
    }

    public static void countMes(String message) {
        PrintToConsole.systemOut(str + message);
        if (!message.equals(lastmessage) && !lastmessage.equals("")) {
            count = 1;
        }
        else {
            count++;
        }
        lastmessage = message;
        PrintToConsole.systemOut(message + " (x"+count+")");
    }

}
