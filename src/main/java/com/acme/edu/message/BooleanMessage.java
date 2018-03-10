package com.acme.edu.message;

import com.acme.edu.formater.FormatVisitor;

public class BooleanMessage implements Message {
    private final boolean mes;

    public BooleanMessage(boolean message) {
        mes = message;
    }

    @Override
    public String accept(FormatVisitor formatVisitor) {
        return formatVisitor.formatBooleanMessage(this);
    }

    @Override
    public String toString() {
        return String.valueOf(mes);
    }
}
