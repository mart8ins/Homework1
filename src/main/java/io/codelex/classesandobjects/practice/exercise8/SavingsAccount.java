package io.codelex.classesandobjects.practice.exercise8;

public class SavingsAccount {
    private double startingBalance;
    private double withdrawn;
    private double deposited;
    private double totalInterestEarned;

    public SavingsAccount(double startingBalance) {
        this.startingBalance = startingBalance;
    }

    public void withdraw(double amount) {
        withdrawn += amount;
    }

    public void deposit(double amount) {
        deposited += amount;
    }

    public void monthlyInterest(double anualInterest) {
        double interest = ((anualInterest / 12) / 100) * startingBalance;
        totalInterestEarned += interest;
    }

    public double getEndingBalance() {
        return startingBalance - withdrawn + deposited + totalInterestEarned;
    }

    public void getAccountData() {
        System.out.printf("Total deposited: %.2f \n", deposited);
        System.out.printf("Total withdrawn: %.2f \n", withdrawn);
        System.out.printf("Interest earned: %.2f \n", totalInterestEarned);
        System.out.printf("Ending balance: %.2f \n", getEndingBalance());

    }
}
