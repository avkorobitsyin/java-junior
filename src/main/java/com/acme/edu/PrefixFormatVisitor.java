package com.acme.edu;

public class PrefixFormatVisitor implements FormatVisitor {
    @Override
    public String formatIntMessage(IntAccumulatedMessage message) {
        return "primitive: " + message;
    }

    @Override
    public String formatArraysMessage(ArraysMesage message) {
        return "primitives array: " + message;
    }

    @Override
    public String formatCharMessage(CharMessage message) {
        return "char: " + message;
    }

    @Override
    public String formatByteMessage(ByteMessage message) {
        return "primitive: " + message;
    }

    @Override
    public String formatMatrixMessage(MatrixMesage message) {
        return "primitives matrix: {" + message;
    }

    @Override
    public String formatObjectMessage(ObjectMessage message) {
        return "reference: " + message + "/n@" + message;
    }

    @Override
    public String formatStringMessage(StringAccumulatedMessage message) {
        return "string: " + message;
    }

    @Override
    public String formatBooleanMessage(BooleanMessage message) {
        return "primitive: " + message;
    }
}
