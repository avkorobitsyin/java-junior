package com.acme.edu.message;

import com.acme.edu.formater.FormatVisitor;

/**
 * Вывод и суммирование строк
 */
public class StringAccumulatedMessage extends AccumulatedMesage {
    private int count = 1;
    private final String mes;


    public StringAccumulatedMessage(String message) {
       mes = message;
    }

    @Override
    public String accept(FormatVisitor formatVisitor) {
        return formatVisitor.formatStringMessage(this);
    }

    @Override
    public void accumulate(AccumulatedMesage accumulatedMesage) {
            count++;
        }

    @Override
    public Object getMessage() {
        return count == 1 ? mes : mes + " (x" + count + ")" ;
    }

    @Override
    public boolean isNeedToAccumulate(AccumulatedMesage accumulatedMesage) {
        return accumulatedMesage.getMessage().equals(mes);
    }

    @Override
    public AccumulatedMesage clone() {
        return new StringAccumulatedMessage(mes);
    }

    @Override
    public String toString() {
        return count == 1 ? mes : mes + " (x" + count + ")" ;
    }
}
