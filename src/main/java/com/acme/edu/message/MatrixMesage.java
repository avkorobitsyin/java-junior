package com.acme.edu.message;

import com.acme.edu.formater.FormatVisitor;

/**
 * Вывод двумерного массива
 */
public class MatrixMesage implements Message {
    private final int[][] mes;

    public MatrixMesage(int[][] message) {
        mes = message;
    }

    @Override
    public String accept(FormatVisitor formatVisitor) {
        return formatVisitor.formatMatrixMessage(this);
    }

    @Override
    public String toString() {
        String s1 = "{";
        for (int[] me : mes) {
            s1 = s1 + "{";
            for (int j = 0; j < mes.length; j++) {
                s1 = s1 + me[j];
                if (j != mes.length - 1) {
                    s1 = s1 + ", ";
                }
            }
            s1 = s1 + "}\n";
        }
        s1 = s1 + "}";
        return s1;
    }
}
