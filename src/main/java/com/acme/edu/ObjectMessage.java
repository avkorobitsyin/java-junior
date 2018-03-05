package com.acme.edu;

/**
 * Вывод ссылки на объект
 */
public class ObjectMessage implements Message {
    private static String ref = "reference: ";
    private static String sob = "/n@";

    @Override
    public void printMessage(Object o) {
        Printer p = new ConsolePrinter();
        p.systemOut(ref + o + sob + o);
    }
}
