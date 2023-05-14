package io.codelex.classesandobjects.practice;

import java.sql.SQLOutput;

public class AccountTest {
    public static void main(String[] args) {

        // FIRST ACCOUNT
        System.out.println("***************** FIRST ACCOUNT ******************");
        Account myFirst = new Account("First acount", 100.00);
        System.out.println("*Initial state");
        System.out.println(myFirst);

        myFirst.deposit(20.00);
        System.out.println("First account balance is now: " + myFirst.balance());

        System.out.println("*Final state");
        System.out.println(myFirst);


        // MONEY TRANSFER
        System.out.println("***************** MONEY TRANSFER ******************");
        Account mattsAccount = new Account("Matt's account", 1000.00);
        Account myAccount = new Account("My account", 0);

        System.out.println("* Initial state");
        System.out.println(mattsAccount);
        System.out.println(myAccount);


        mattsAccount.sendMoney(myAccount, 100.00);
        System.out.println("Matt's account balance is now: " + mattsAccount.balance());
        System.out.println("My account account balance is now: " + myAccount.balance());

        System.out.println("* Final state");
        System.out.println(mattsAccount);
        System.out.println(myAccount);

        // USING METHOD
        Account a = new Account("A", 100.00);
        Account b = new Account("B", 0.00);
        Account c = new Account("C", 0.00);

        transfer(a, b, 50.00);
        transfer(b, c, 25.00);

    }

    private static void transfer(Account from, Account to, double howMuch) {
        from.withdrawal(howMuch);
        to.deposit(howMuch);
    }


}
