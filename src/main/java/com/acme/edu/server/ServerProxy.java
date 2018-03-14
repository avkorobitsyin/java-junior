package com.acme.edu.server;

import com.acme.edu.formater.PrefixFormatVisitor;
import com.acme.edu.logger.*;
import com.acme.edu.message.Message;

/**
 Server Proxy
 */
public class ServerProxy {
    private static LoggerController loggerController = new LoggerController(System.out::println, new PrefixFormatVisitor());
    public void flush() {
        loggerController.flush();
    }
    public void sendMessage(Message message) {
        loggerController.loggerMessage(message);
    }
}
