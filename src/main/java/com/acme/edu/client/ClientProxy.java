package com.acme.edu.client;


import com.acme.edu.message.ArraysMesage;
import com.acme.edu.message.IntAccumulatedMessage;
import com.acme.edu.message.Message;
import com.acme.edu.message.StringAccumulatedMessage;

public class ClientProxy {
    public static void main(String[] args) {
        Connector connector = new Connector();
        connector.sendMessage(new IntAccumulatedMessage(10));
        connector.sendMessage(new IntAccumulatedMessage(10));
        connector.sendMessage(new IntAccumulatedMessage(10));
        connector.sendMessage(new StringAccumulatedMessage("sdefwe"));
        connector.sendMessage(new ArraysMesage(new int[]{1, 3, 5, 56}));
    }
}
