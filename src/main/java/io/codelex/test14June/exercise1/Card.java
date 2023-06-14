package io.codelex.test14June.exercise1;

public abstract class Card {
    protected String cardNumber;
    protected String owner;
    protected String ccv;
    protected double balance;

    public Card(String cardNumber, String owner, String ccv, double balance) {
        this.cardNumber = cardNumber;
        this.owner = owner;
        this.ccv = ccv;
        this.balance = balance;
    }

    public abstract void depositMoney(double amount);

    public abstract void withdrawMoney(double amount);

    @Override
    public String toString() {
        return "Card{" +
                "cardNumber='" + cardNumber + '\'' +
                ", owner='" + owner + '\'' +
                ", ccv='" + ccv + '\'' +
                ", balance=" + balance +
                '}';
    }
}
