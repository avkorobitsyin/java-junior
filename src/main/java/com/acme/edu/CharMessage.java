package com.acme.edu;

/**
 * Вывод символов
 */
public class CharMessage implements Message {
    private static String chr = "char: ";

    @Override
    public void printMessage(Object o)  {
            Printer p = new ConsolePrinter();
            p.systemOut(chr + o);

    }
}
