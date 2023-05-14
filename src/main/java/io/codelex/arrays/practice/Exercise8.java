package io.codelex.arrays.practice;

import java.util.Random;
import java.util.Scanner;

public class Exercise8 {

    private static void playHangman() {
        Scanner scanner = new Scanner(System.in);
        String words[] = {"dog", "cat", "programming", "java", "monitor", "hockey"};

        Random random = new Random();
        String randomWord = words[random.nextInt(words.length)];
        int guessTries = randomWord.length();
        String wordInProgress = "_".repeat(randomWord.length());
        String misses = "";

        System.out.println("Welcome to guessing game. Guess the word: " + wordInProgress + ". You have " + guessTries + " tries");


        while (wordInProgress.contains("_") && guessTries > 0) {
            String guess = scanner.nextLine().toLowerCase();
            while (guess.length() > 1) {
                System.out.println("You are allowed to guess only one character. You lost one try, guess again.");
                misses += " " + guess + " ";
                guess = scanner.nextLine().toLowerCase();
                guessTries--;
            }
            guessTries--;
            System.out.println("Current guess is - " + guess);


            int indexOfCharInString = randomWord.indexOf(guess);
            if (indexOfCharInString != -1) {
                String[] splitedWord = wordInProgress.split("");
                splitedWord[indexOfCharInString] = guess;
                wordInProgress = String.join("", splitedWord);
            } else {
                misses += " " + guess + " ";
                System.out.println("Wrong guess.");
            }
            System.out.println("Current progress for guessing is " + wordInProgress + ". " + "You have " + guessTries + " tries left. Current misses: " + (misses.length() > 0 ? misses : 0));
        }

        if (wordInProgress.contains(randomWord)) {
            System.out.println("Good job, you guessed the word - " + randomWord);
        } else {
            System.out.println("Sorry, you are out of tries. Game lost.");
        }

        System.out.println("Play again? Enter y for Yes, n for No");
        String playAgain = scanner.nextLine();
        if (playAgain.contains("y")) {
            playHangman();
        }

    }

    public static void main(String[] args) {
        playHangman();
    }
}
