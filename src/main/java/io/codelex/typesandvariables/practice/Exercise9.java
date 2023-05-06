package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Runner, please enter the details for your run.");
        System.out.println("Distance in meters:");
        int meters = in.nextInt();
        System.out.println("Hours:");
        int hours = in.nextInt();
        System.out.println("Minutes:");
        int minutes = in.nextInt();
        System.out.println("Seconds:");
        int seconds = in.nextInt();

        // METERS PER SECOND
        double totalSeconds = (hours * 60 * 60) + (minutes * 60) + seconds;
        double metersPerSecond = meters / totalSeconds;

        // KILOMETERS PER HOUR
        double kilometersPerHour = ((double) meters / 1000) / ((double) minutes / 60 + hours);

        // MILES PER HOUR
        double milesPerHour = ((double) meters / 1609) / ((double) minutes / 60 + hours);

        System.out.printf("Your speed in meters/second is %f \n", metersPerSecond);
        System.out.printf("Your speed in km/h is %f \n", kilometersPerHour);
        System.out.printf("Your speed in miles/h is %f \n", milesPerHour);


    }
}
