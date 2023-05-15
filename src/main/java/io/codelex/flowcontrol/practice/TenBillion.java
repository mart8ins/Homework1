package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class TenBillion {
    public static String typeOf(long l) {
        return "long";
    }

    //TODO: Write a Java program that reads an positive integer and count the number of digits the number (less than ten billion) has.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input an integer number less than ten billion: ");

        long n = in.nextLong();

        /*
        todo - check if Long
        */

        //todo - check if n is less than zero
        if (n < 0) {
            n *= -1;
        }
//           fixme
        if (n >= 10_000_000_000l) {
            System.out.println("Number is greater or equals 10,000,000,000!");
        } else {

            int digits = 1;
            if (Long.toString(n).length() == 2) {
                digits = 2;
            } else if (Long.toString(n).length() == 3) {
                digits = 3;
            } else if (Long.toString(n).length() == 4) {
                digits = 4;
            } else if (Long.toString(n).length() == 5) {
                digits = 5;
            } else if (Long.toString(n).length() == 6) {
                digits = 6;
            } else if (Long.toString(n).length() == 7) {
                digits = 7;
            } else if (Long.toString(n).length() == 8) {
                digits = 8;
            } else if (Long.toString(n).length() == 9) {
                digits = 9;
            } else if (Long.toString(n).length() == 10) {
                digits = 10;
            }
            /*
             * All if`s we can replace with one line
             * digits = Long.toString(n).length()
             * */

            System.out.println("Number of digits in the number: " + digits);
        }
    }
}
