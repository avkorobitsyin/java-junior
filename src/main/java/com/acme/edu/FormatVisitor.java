package com.acme.edu;

public interface FormatVisitor {
    String formatIntMessage(IntAccumulatedMessage message);
    String formatArraysMessage(ArraysMesage mesage);
    String formatCharMessage(CharMessage message);
    String formatByteMessage(ByteMessage message);
    String formatMatrixMessage(MatrixMesage message);
    String formatObjectMessage(ObjectMessage message);
    String formatStringMessage(StringAccumulatedMessage message);
    String formatBooleanMessage(BooleanMessage message);
}
