package com.acme.edu.message;

import com.acme.edu.formater.FormatVisitor;

public class ByteMessage implements Message {
    private final byte mes;

    public ByteMessage(byte message) {
        mes = message;
    }

    @Override
    public String toString() {
        return String.valueOf(mes);
    }

    @Override
    public String accept(FormatVisitor formatVisitor) {
        return formatVisitor.formatByteMessage(this);
    }
}
