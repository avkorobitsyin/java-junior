package com.acme.edu.message;

import com.acme.edu.formater.FormatVisitor;

/**
 * Интерфейс для вывода сообщений разных типов
 */
public interface Message {
    String accept(FormatVisitor formatVisitor);
}
