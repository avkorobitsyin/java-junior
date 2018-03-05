package com.acme.edu;

/**
 * Вывод двумерного массива
 */
public class MatrixMesage implements Message {
    private static String matr = "primitives matrix: {";

    @Override
    public void printMessage(Object o) {
        Printer p = new ConsolePrinter();
        p.systemOut(matr);
        for (int i = 0; i < ((int[][]) o).length; i++) {
            ConsolePrinter.systemPrint("{");
            for (int j = 0; j < ((int[][]) o).length; j++) {
                ConsolePrinter.systemPrint(((int[][]) o)[i][j]);
                if (j != ((int[][]) o).length - 1) {
                    ConsolePrinter.systemPrint(", ");
                }
            }
            p.systemOut("}");
        }
        p.systemOut("}");
    }
}
