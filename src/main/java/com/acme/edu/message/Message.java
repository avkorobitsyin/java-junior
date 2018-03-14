package com.acme.edu.message;

import com.acme.edu.formater.FormatVisitor;

import java.io.Serializable;

/**
 * Интерфейс для вывода сообщений разных типов
 */
public interface Message extends Serializable {
    String accept(FormatVisitor formatVisitor);
}
