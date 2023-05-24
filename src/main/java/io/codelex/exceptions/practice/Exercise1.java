package io.codelex.exceptions.practice;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Enter the numerator");
                String numerator = scanner.nextLine();
                if (numerator.toLowerCase().equals("q")) {
                    break;
                } else if (numerator.chars().allMatch(Character::isLetter)) {
                    throw new ArithmeticException("Please provide only numbers.");
                }

                System.out.println("Enter the divisor");
                String divisor = scanner.nextLine();

                if (divisor.chars().allMatch(Character::isLetter)) {
                    throw new NumberFormatException("Please provide only numbers.");
                } else {
                    if (Integer.parseInt(divisor) < 1) {
                        throw new ArithmeticException("Can`t divide with 0.");
                    }
                }
                System.out.println(numerator + " / " + divisor + " = " + (double) Integer.parseInt(numerator) / (double) Integer.parseInt(divisor));
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
