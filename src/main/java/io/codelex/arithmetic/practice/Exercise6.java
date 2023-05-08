package io.codelex.arithmetic.practice;

public class Exercise6 {
    private static void cozaLozaWoza() {
        for (int i = 1; i <= 110; i++) {

            if (i % 11 == 1) {
                System.out.println("");
            }

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("CozaLoza ");
            } else if (i % 3 == 0) {
                System.out.print("Coza ");
            } else if (i % 5 == 0) {
                System.out.print("Loza ");
            } else if (i % 7 == 0) {
                System.out.print("Woza ");
            } else {
                System.out.print(i + " ");
            }

        }

    }

    public static void main(String[] args) {
        cozaLozaWoza();
    }
}
