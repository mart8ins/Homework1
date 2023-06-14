package io.codelex.test14June.exercise1;

public class DebitCard extends Card {

    public DebitCard(String cardNumber, String owner, String ccv, double balance) {
        super(cardNumber, owner, ccv, balance);
    }

    @Override
    public void depositMoney(double amount) {
        if (balance > 10000) {
            System.out.println("Warning: Too much money");
        }
        balance += amount;
    }

    @Override
    public void withdrawMoney(double amount) {
        try {
            if (amount > balance) {
                throw new NotEnoughFundsException("You dont have enough funds in your balance.");
            } else {
                balance = -amount;
            }
        } catch (NotEnoughFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
