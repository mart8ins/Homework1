package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise7 {
    private static void printStringUppercaseCount() {
        int upperCaseCount = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a string.");
        String string = in.nextLine();

        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (Character.isUpperCase(c)) {
                upperCaseCount++;
            }
        }

        System.out.printf("Your string contains %s uppercase characters.", upperCaseCount);
    }

    public static void main(String[] args) {
        printStringUppercaseCount();
    }
}
