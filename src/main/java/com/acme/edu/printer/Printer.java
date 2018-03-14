package com.acme.edu.printer;

/**
 * Интерфейс для вывода сообщения куда-либо.
 * Например: в консоль или файл
 */
@FunctionalInterface
public interface Printer {
    void systemOut(Object s);
}
