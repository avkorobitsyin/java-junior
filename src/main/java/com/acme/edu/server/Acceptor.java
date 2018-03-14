package com.acme.edu.server;

import com.acme.edu.message.Message;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Acceptor  {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(7777)) {
            ServerProxy serverProxy = new ServerProxy();
            //Session loop
            while (true) {
                try (Socket clientSession = serverSocket.accept();
                     ObjectInputStream inputStream = new ObjectInputStream(clientSession.getInputStream())) {

                    while (true) {
                        Message message = (Message) inputStream.readObject();
                        serverProxy.sendMessage(message);
                        serverProxy.flush();
                    }

                } catch (IOException | ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}