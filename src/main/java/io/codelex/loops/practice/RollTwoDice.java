package io.codelex.loops.practice;

import java.util.Random;
import java.util.Scanner;

public class RollTwoDice {

    private static void startDiceGame() {
        int diceOptions = 6;
        int desiredSum;
        int firstRoll;
        int secondRoll;

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Please enter desired sum: ");
        desiredSum = scanner.nextInt();
        System.out.println("Desired sum is " + desiredSum);
        do {
            firstRoll = random.nextInt(diceOptions) + 1;
            secondRoll = random.nextInt(diceOptions) + 1;
            System.out.println(firstRoll + " + " + secondRoll + " = " + (firstRoll + secondRoll));
        } while (firstRoll + secondRoll != desiredSum);
    }

    public static void main(String[] args) {
        startDiceGame();
        System.out.println();
    }
}
