package com.acme.edu.client;

import com.acme.edu.message.*;

public class Proxy {
    public void log(char message) {
        Message mes = new CharMessage(message);
    }

    public void log(byte message) {
        Message mes = new ByteMessage(message);
    }

    public void log(boolean message) {
        Message mes = new BooleanMessage(message);
    }

    public void log(Object message) {
        Message mes = new ObjectMessage(message);
    }

    public void log(int[] message) {
        Message mes = new ArraysMesage(message);
    }

    public void log(int[][] message) {
        Message mes = new MatrixMesage(message);
    }

    public void log(int message) {
        Message mes = new IntAccumulatedMessage(message);
    }

    public void log(String message) {
        Message mes = new StringAccumulatedMessage(message);
    }
}
