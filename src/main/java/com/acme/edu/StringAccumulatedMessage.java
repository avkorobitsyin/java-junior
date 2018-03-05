package com.acme.edu;

/**
 * Вывод и суммирование строк
 */
public class StringAccumulatedMessage implements Message {
    private static String str = "string: ";
    private static String lastmessage = "";
    private static int count = 0;


    @Override
    public void printMessage(Object o) {
        Printer p = new ConsolePrinter();
        p.systemOut(str + o);
        if (!o.equals(lastmessage) && !lastmessage.equals("")) {
            count = 1;
        } else {
            count++;
        }
        lastmessage = o.toString();
        p.systemOut(o + " (x" + count + ")");
    }
}
