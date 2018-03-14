package com.acme.edu.server;

import com.acme.edu.logger.Logger;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Acceptor {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(7777)) {

            while (true) { //Session loop

                try (Socket clientSession = serverSocket.accept();
                     ObjectInputStream inputStream = new ObjectInputStream(clientSession.getInputStream())) {

                   // while (true)  //request loop
                        System.out.println(inputStream.read());


                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}