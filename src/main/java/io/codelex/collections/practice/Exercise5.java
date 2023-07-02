package io.codelex.collections.practice;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Add number to check if it is happy number.");

        while (true) {
            int numberToCheck = in.nextInt();
            String numberToCheckTOString = Integer.toString(numberToCheck);


            while (numberToCheckTOString.length() > 1) {
                int sum = 0;
                numberToCheckTOString = Integer.toString(numberToCheck);
                for (int i = 0; i < numberToCheckTOString.length(); i++) {
                    sum += (int) Math.pow(Integer.parseInt(Character.toString(numberToCheckTOString.charAt(i))), 2);
                }
                numberToCheck = sum;
                if (sum == 1) break;
            }
            if (numberToCheck == 1) {
                System.out.println("Number is happy.");
            } else {
                System.out.println("Number is not happy.");
            }
        }
    }
}
