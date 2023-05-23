package io.codelex.dateandtime.practice.exercise2;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the server launch date - format YYYY-MM-DD.");
        String launchDate = in.nextLine();
        System.out.println("Please enter number of update dates you want to see.");
        int nextUpdates = in.nextInt();

        System.out.println(Server.updatesPlaned(launchDate, nextUpdates));

    }
}
