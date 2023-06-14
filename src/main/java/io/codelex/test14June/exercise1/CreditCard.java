package io.codelex.test14June.exercise1;

public class CreditCard extends Card {

    public CreditCard(String cardNumber, String owner, String ccv, double balance) {
        super(cardNumber, owner, ccv, balance);
    }

    @Override
    public void depositMoney(double amount) {
        balance += amount;
    }

    @Override
    public void withdrawMoney(double amount) {
        if (balance < 100) {
            System.out.println("Warning: Low funds");
        }
        try {
            if (amount > balance) {
                throw new NotEnoughFundsException("You dont have enough funds in your balance.");
            } else {
                balance -= amount;
            }
        } catch (NotEnoughFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
