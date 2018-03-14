package com.acme.edu.client;

import com.acme.edu.formater.PrefixFormatVisitor;
import com.acme.edu.message.Message;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Connector {
    public void sendMessage(Message message) {
        try (Socket clientSocket = new Socket("127.0.0.1", 7777)) {

            try (ObjectOutputStream outputStream = new ObjectOutputStream(clientSocket.getOutputStream());) {
                outputStream.writeObject(message);
            }

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
