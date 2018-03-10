package com.acme.edu.message;

import com.acme.edu.formater.FormatVisitor;

/**
 * Вывод числа и его суммирование
 */
public class IntAccumulatedMessage extends AccumulatedMesage {


    private int mes;

    public IntAccumulatedMessage(int message) {
         mes = message;
    }

    @Override
    public String accept(FormatVisitor formatVisitor) {
        return formatVisitor.formatIntMessage(this);
    }

    @Override
    public void accumulate(AccumulatedMesage accumulatedMesage) {
        this.mes += Integer.valueOf(accumulatedMesage.getMessage().toString());
    }

    @Override
    public Object getMessage() {
        return mes;
    }

    @Override
    public boolean isNeedToAccumulate(AccumulatedMesage accumulatedMesage) {
        return true;
    }

    @Override
    public AccumulatedMesage clone() {
        return new IntAccumulatedMessage(mes);
    }

    @Override
    public String toString() {
        return String.valueOf(mes);
    }
}
