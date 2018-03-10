package com.acme.edu.message;

import com.acme.edu.formater.FormatVisitor;

/**
 * Вывод символов
 */
public class CharMessage implements Message {
    private final char mes;

    public CharMessage(char message) {
        mes = message;
    }

    @Override
    public String accept(FormatVisitor formatVisitor) {
        return formatVisitor.formatCharMessage(this);
    }

    @Override
    public String toString() {
        return String.valueOf(mes);
    }
}
