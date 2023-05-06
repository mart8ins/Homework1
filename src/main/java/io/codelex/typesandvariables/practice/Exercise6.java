package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise6 {
    private static void calculateSum() {
        int sum = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Hello. Please enter 3 numbers.");
        for (int i = 0; i < 3; i++) {
            sum += in.nextInt();
        }

        System.out.printf("Thanks! Sum of your numbers is %s ", sum);

    }

    public static void main(String[] args) {
        calculateSum();
    }
}
