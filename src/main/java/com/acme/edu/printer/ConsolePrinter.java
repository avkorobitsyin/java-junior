package com.acme.edu.printer;

/**
 * Вывод сообщения в консоль
 */
public class ConsolePrinter implements Printer {

    @Override
    public void systemOut(Object s) {
        System.out.println(s);
    }

}
