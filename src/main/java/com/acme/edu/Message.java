package com.acme.edu;

/**
 * Интерфейс для вывода сообщений разных типов
 */
public interface Message {
    //void printMessage(Object o);
    String accept(PrefixFormatVisitor formatVisitor);

}
