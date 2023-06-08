package io.codelex.classesandobjects.practice;

// Each BankAccount object represents one user's account
// information including name and balance of money.

public class BankAccount {
    public String name;
    public double balance;

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    @Override
    public String toString() {
        String formatedNumber = String.format("%.2f", Math.abs(balance));
        String sign = balance < 0 ? "-" : "";
        return name + "," + sign + "$" + formatedNumber;
    }

    public final void deposit(double amount) {
        //todo
        balance += amount;
    }

    public final void withdraw(double amount) {
        //todo
        balance -= amount;
    }

}
