package io.codelex.classesandobjects.practice.exercise5;

public class DateTest {
    public static void main(String[] args) {
        Date date = new Date(11, 20, 2023);
        date.displayDate();

        // a year, month, day later
        date.setMonth(6);
        date.setDay(15);
        date.setYear(2024);
        date.displayDate();

        System.out.println("What year it is? Answer: " + date.getYear());
        System.out.println("What Month it is? Answer: " + date.getMonth());
        System.out.println("What day it is? Answer: " + date.getDay());
    }
}
