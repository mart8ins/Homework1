package io.codelex.enums.practice.exercise2;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String userInput;

        System.out.println("Let us begin!");
        System.out.println("Scissor-Paper-Stone");

        while (true) {
            System.out.println("Your turn (Enter s for scissor, p for paper, t for stone, q to quit):");
            userInput = in.nextLine().toUpperCase();
            if (userInput.matches("[S,P,T,Q]")) {
                if (userInput.equals("Q")) {
                    break;
                }
                String userWeapon = Game.getUserWeapon(userInput);
                String computerWeapon = Game.getComputerWeapon();
                String winner = Game.getWinner(userWeapon, computerWeapon);
                System.out.println(winner);
            } else {
                System.out.println("Please enter correct values.");
            }

        }
        System.out.println(Game.getGameStats());
    }
}
