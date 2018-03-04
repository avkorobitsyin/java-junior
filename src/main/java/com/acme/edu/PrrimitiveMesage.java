package com.acme.edu;

/**
 * Created by avkor on 04.03.2018.
 */
public class PrrimitiveMesage {
    public static String prim = "primitive: ";

    public static void primMesage(byte message) {
        Message.systemOut(prim + message);
    }
    public static void primMessage(boolean message) {
        Message.systemOut(prim+message);
    }
    public static void primMessage(int message) {
        Message.systemOut(prim+message);
    }
}
