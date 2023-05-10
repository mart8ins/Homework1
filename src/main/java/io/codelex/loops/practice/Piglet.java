package io.codelex.loops.practice;

import java.util.Random;
import java.util.Scanner;

public class Piglet {

    private static void game() {
        int totalScore = 0;
        int diceOptions = 6;
        boolean gameStopped = false;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to piglet!");
        while (!gameStopped) {
            Random random = new Random();
            int dice = random.nextInt(diceOptions) + 1;
            if (dice == 1) {
                totalScore = 0;
                System.out.println("You rolled " + dice + ". Your total score is " + totalScore + " you lost the game.");
                gameStopped = true;
            } else {
                totalScore += dice;
                System.out.println("You rolled " + dice + ". Your total score is " + totalScore);
                System.out.println("Roll again? Type \'y\' to roll again or \'n\' to quit the game.");
                String continueGame = scanner.nextLine();

                if (continueGame.equals("n")) {
                    System.out.println("You quit the game. Your score is " + totalScore);
                    gameStopped = true;
                }
            }

        }


    }

    public static void main(String[] args) {
        game();
    }
}
