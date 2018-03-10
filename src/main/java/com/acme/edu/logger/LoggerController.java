package com.acme.edu.logger;

import com.acme.edu.formater.FormatVisitor;
import com.acme.edu.message.AccumulatedMesage;
import com.acme.edu.message.IntAccumulatedMessage;
import com.acme.edu.message.Message;
import com.acme.edu.message.StringAccumulatedMessage;
import com.acme.edu.printer.Printer;

import java.util.ArrayList;

/**
 * Контроль за аккумулированием сообщений и их выводом
 */
class LoggerController {
    private ArrayList<Message> messageList = new ArrayList<>();
    private final Printer printer;
    private FormatVisitor formatVisitor;

    LoggerController(Printer printer, FormatVisitor visitor) {
        this.printer = printer;
        this.formatVisitor = visitor;
    }

    void loggerMessage(Message message) {
        if (!messageList.isEmpty() &&
                messageList.get(messageList.size() - 1).getClass().
                        equals(message.getClass())
                && message instanceof AccumulatedMesage) {
            if (message instanceof StringAccumulatedMessage) {
                AccumulatedMesage last = (AccumulatedMesage) messageList.get(messageList.size() - 1);
                if (last.isNeedToAccumulate((AccumulatedMesage) message)) {
                    last.accumulate((AccumulatedMesage) message);
                    messageList.remove(messageList.size() - 1);
                    messageList.add(last);
                } else {
                    messageList.add(message);
                }
            }
            if (message instanceof IntAccumulatedMessage) {
                AccumulatedMesage last = ((AccumulatedMesage) messageList.get(messageList.size() - 1)).clone();
                if (last.isNeedToAccumulate((AccumulatedMesage) message)) {
                    if(messageList.size() > 2) {
                        AccumulatedMesage size2 = (AccumulatedMesage) messageList.get(messageList.size() - 2);
                        if ( size2 instanceof IntAccumulatedMessage) {
                            last.accumulate((AccumulatedMesage) message);
                            messageList.remove(messageList.size() - 1);
                            messageList.add(message);
                            messageList.add(last);
                        }
                    } else {
                        messageList.add(message);
                        last.accumulate((AccumulatedMesage) message);
                        messageList.add(last);
                    }

                }
            }
        } else {
            messageList.add(message);
        }
    }

    void flush() {
        for (Message m : messageList) {
            printer.systemOut(m.accept(formatVisitor));
        }
        messageList.clear();
    }
}
