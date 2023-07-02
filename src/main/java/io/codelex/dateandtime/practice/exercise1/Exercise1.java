package io.codelex.dateandtime.practice.exercise1;


import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        int hours;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter date one: format YYYY-MM-DD");
        String date1 = in.nextLine();
        System.out.println("Please enter date two: format YYYY-MM-DD");
        String date2 = in.nextLine();

        hours = WorkingHours.calculateWorkingHours(date1, date2);
        System.out.println(hours + " working hours during for the current period.");
    }
}
