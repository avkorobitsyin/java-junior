package com.acme.edu.message;

import com.acme.edu.formater.FormatVisitor;

/**
 * Вывод ссылки на объект
 */
public class ObjectMessage implements Message {
    private final Object mes;

    public ObjectMessage(Object message) {
        mes = message;
    }

    @Override
    public String accept(FormatVisitor formatVisitor) {
        return formatVisitor.formatObjectMessage(this);
    }

}
