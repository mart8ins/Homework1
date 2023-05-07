package io.codelex.arithmetic.practice;

import java.util.Random;
import java.util.Scanner;

public class Exercise5 {
    private static void guessTheNumber() {
        Random random = new Random();
        int num = random.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("I'm thinking of a number between 1-100.  Try to guess it.");
        int userInput = scanner.nextInt();

        if (userInput == num) {
            System.out.printf("You guessed it!  What are the odds?!?");
        } else if (userInput > num) {
            System.out.printf("Sorry, you are too high.  I was thinking of %s.", num);
        } else if (userInput < num) {
            System.out.printf("Sorry, you are too low.  I was thinking of %s.", num);
        }
    }

    public static void main(String[] args) {
        guessTheNumber();
    }
}
