package com.acme.edu;

/**
 * Вывод сообщения в консоль
 */
public class ConsolePrinter implements Printer {

    public ConsolePrinter(FormatVisitor form) {
    }

    public static void systemPrint(Object s) {
        System.out.print(s);
    }

    @Override
    public void systemOut(Object s) {
        System.out.println(s.toString());
    }


}
