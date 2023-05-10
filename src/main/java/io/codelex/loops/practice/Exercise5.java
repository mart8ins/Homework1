package io.codelex.loops.practice;

import java.util.Scanner;

public class Exercise5 {
    public static void printTwoWords() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the first word - ");
        String word1 = scanner.nextLine();

        System.out.println("Please enter the second word - ");
        String word2 = scanner.nextLine();

        System.out.print(word1);
        for (int i = 0; i < (30 - word1.length() - word2.length()); i++) {
            System.out.print(".");
        }
        System.out.print(word2);
    }

    public static void main(String[] args) {
        printTwoWords();
    }
}
