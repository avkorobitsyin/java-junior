package com.acme.edu;

import java.util.Arrays;

/**
 * Вывод массива
 */

public class ArraysMesage implements Message {
    private static String arr = "primitives array: ";

    @Override
    public void printMessage(Object o) {
        String ss = Arrays.toString((int[]) o);
        String sss = ss.replace('[', '{').replace(']', '}');
        Printer p = new ConsolePrinter();
        p.systemOut(arr + sss);
    }
}
