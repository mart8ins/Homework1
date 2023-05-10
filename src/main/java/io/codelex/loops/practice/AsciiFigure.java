package io.codelex.loops.practice;

public class AsciiFigure {
    private static void drawFigureRows(int r) {
        int rows = r >= 2 ? 1 + r : r * r;
        int elementsInLine = 8 * r;

        for (int row = 0; row < rows; row++) {
            for (int i = 0; i < elementsInLine / 2 - row * 4; i++) {
                System.out.print("/");
            }
            for (int m = 0; m < row * 8; m++) {
                System.out.print("*");
            }
            for (int j = 0; j < elementsInLine / 2 - row * 4; j++) {
                System.out.print("\\");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        drawFigureRows(2);
        drawFigureRows(3);
        drawFigureRows(5);
        drawFigureRows(7);
        drawFigureRows(8);


    }
}
