package com.acme.edu.message;

import com.acme.edu.formater.FormatVisitor;

import java.util.Arrays;

/**
 * Вывод массива
 */

public class ArraysMesage implements Message {
    private final int[] mes;

    public ArraysMesage(int[] message) {
        mes = message;
    }


    @Override
    public String accept(FormatVisitor formatVisitor) {
        return formatVisitor.formatArraysMessage(this);
    }

    @Override
    public String toString() {
        String ss = Arrays.toString(mes);
        return ss.replace('[', '{').replace(']', '}');
    }
}
