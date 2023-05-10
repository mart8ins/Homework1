package io.codelex.loops.practice;

import java.util.Scanner;

public class FizzBuzz {

    private static void printFizzBuzz() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int input = scanner.nextInt();

        for (int i = 1; i <= input; i++) {
            if (i % 20 == 1) {
                System.out.println();
            }
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz ");
            } else if (i % 3 == 0) {
                System.out.print("Fizz ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz ");
            } else {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        printFizzBuzz();
    }
}
