package com.acme.edu.message;

/**
 Абстрактный класс для сообщений которые можно аккумулировать
 */
public abstract class AccumulatedMesage implements Message, Cloneable {
    public abstract void accumulate(AccumulatedMesage accumulatedMesage);
    public abstract Object getMessage();
    public abstract boolean isNeedToAccumulate(AccumulatedMesage accumulatedMesage);
    @Override
    public abstract AccumulatedMesage clone();
}
