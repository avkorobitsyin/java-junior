package com.acme.edu;

public class ByteMessage implements Message {
    private static String prim = "primitive: ";

    @Override
    public void printMessage(Object o) {
        Printer p = new ConsolePrinter();
        p.systemOut(prim + o);
    }
}
