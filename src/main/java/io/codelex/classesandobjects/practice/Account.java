package io.codelex.classesandobjects.practice;

public class Account {
    private double balance;
    private String owner;

    public Account(String owner, double balance) {
        this.balance = balance;
        this.owner = owner;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdrawal(double amount) {
        balance -= amount;
    }

    public double balance() {
        return balance;
    }

    public void sendMoney(Account account, double amount) {
        this.balance -= amount;
        account.deposit(amount);
        System.out.println("* Successful transfer: " + this.owner + " sent " + amount + " to " + account.owner);
    }

    @Override
    public String toString() {
        return owner + " balance: " + balance;
    }
}
