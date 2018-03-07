package com.acme.edu;

public class BooleanMessage implements Message {

  /*  @Override
    public void printMessage(Object o) {
        PrefixFormatVisitor pf = new PrefixFormatVisitor();
        Printer p = new ConsolePrinter();
        p.systemOut(pf);
    } */

    @Override
    public String accept(PrefixFormatVisitor formatVisitor) {
        return formatVisitor.formatBooleanMessage(this);
    }
}
