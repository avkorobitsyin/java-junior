package com.acme.edu;

/**
 * Print sum String
 */

public class CountString {
    public static String lastmessage = "";
    public static int count = 0;

    public static void countMes(String message) {
        StringMessage.strMessage(message);
        if (!message.equals(lastmessage) && !lastmessage.equals("")) {
            count = 1;
        }
        else {
            count++;
        }
        lastmessage = message;
        Message.systemOut(message + " (x"+count+")");
    }
}
