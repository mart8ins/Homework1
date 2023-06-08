package io.codelex.classesandobjects.practice.exercise8;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How much money is in the account? : ");
        double balance = scanner.nextDouble();

        System.out.println("Enter the annual interest rate:  ");
        int rate = scanner.nextInt();

        System.out.println("How long has the account been opened? ");
        int months = scanner.nextInt();

        SavingsAccount savingAccount = new SavingsAccount(balance);

        for (int i = 1; i <= months; i++) {
            System.out.println("Enter amount deposited for month: " + i + ": ");
            savingAccount.deposit(scanner.nextDouble());

            System.out.println("Enter amount withdrawn for month: " + i + ": ");
            savingAccount.withdraw(scanner.nextDouble());

            savingAccount.monthlyInterest(rate);
        }

        // Interest earned: $29,977.72 - is it mistake in README description?
        savingAccount.getAccountData();

    }
}
