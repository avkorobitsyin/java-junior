package com.acme.edu;

/**
 * Вывод сообщения для byte и boolean
 */
public class PrrimitiveMesage implements Message {
    private static String prim = "primitive: ";

    @Override
    public void printMessage(Object o) {
        Printer p = new ConsolePrinter();
        p.systemOut(prim + o);
    }
}
