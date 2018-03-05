package com.acme.edu;

/**
 * Вывод числа и его суммирование
 */
public class IntAccumulatedMessage implements Message {
    private static String prim = "primitive: ";
    private static int sum = 0;

    @Override
    public void printMessage(Object o) {
        Printer p = new ConsolePrinter();
        p.systemOut(prim + o);
        sum += Integer.valueOf(o.toString());
        p.systemOut(sum);
    }
}
