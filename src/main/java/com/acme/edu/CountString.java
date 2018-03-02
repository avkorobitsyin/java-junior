package com.acme.edu;

public class CountString {
    private static String lastmessage = "";
    private static int count = 0;
    private static String str = "string: ";

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
