package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise8 {
    private static void convertMinutes() {
        int minutesInDay = 60 * 24;
        int minutesInYear = minutesInDay * 365;

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter minutes which you want to convert.");

        double inputMinutes = in.nextDouble();

        double convertedYears = inputMinutes / minutesInYear;
        double convertedDays = (inputMinutes % minutesInYear) / minutesInDay;
        System.out.printf("You entered %.0f minutes which is %.0f years and %.2f days", inputMinutes, convertedYears, convertedDays);
    }

    public static void main(String[] args) {
        convertMinutes();
    }
}
