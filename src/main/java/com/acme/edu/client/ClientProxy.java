package com.acme.edu.client;

import com.acme.edu.logger.Logger;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientProxy {
    public static void main(String[] args) {

        try (Socket clientSocket = new Socket("127.0.0.1", 7777)) {

           try (ObjectOutputStream outputStream = new ObjectOutputStream(clientSocket.getOutputStream());) {
              // Proxy proxy = new Proxy();
               outputStream.write(8);

           }

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
