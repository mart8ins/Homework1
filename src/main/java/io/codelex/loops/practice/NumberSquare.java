package io.codelex.loops.practice;

import java.util.Scanner;

public class NumberSquare {

    private static void printNumberSquare() {
        int min;
        int max;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter number to start range.");
        min = scanner.nextInt();
        System.out.println("Please enter number to end range.");
        max = scanner.nextInt();

        System.out.println("You chose range from " + min + "to " + max);

        for (int line = min; line <= max; line++) {
            for (int i = line; i <= max; i++) {
                System.out.print(i);
            }
            for (int k = min; k < line; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printNumberSquare();
    }
}
