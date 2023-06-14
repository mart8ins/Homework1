package io.codelex.test14June.exercise1;

public class Main {
    public static void main(String[] args) {
        Card creditCard = new CreditCard("12345678", "Martins Meisters", "123", 200);
        Card debitCard = new DebitCard("87654321", "Martins Meisters", "321", 200);

        creditCard.withdrawMoney(170);
        creditCard.withdrawMoney(5);

        debitCard.depositMoney(100000);
        debitCard.depositMoney(200);


    }
}
