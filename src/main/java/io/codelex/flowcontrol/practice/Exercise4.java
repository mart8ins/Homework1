package io.codelex.flowcontrol.practice;

public class Exercise4 {

    private static void printDayInWord() {
        int dayNumber = 1;

        if (dayNumber == 0) {
            System.out.println("Monday");
        } else if (dayNumber == 1) {
            System.out.println("Tuesday");
        } else if (dayNumber == 2) {
            System.out.println("Wednesday");
        } else if (dayNumber == 3) {
            System.out.println("Thursday");
        } else if (dayNumber == 4) {
            System.out.println("Friday");
        } else if (dayNumber == 5) {
            System.out.println("Saturday");
        } else if (dayNumber == 6) {
            System.out.println("Sunday");
        } else {
            System.out.println("Number out of range.");
        }

        switch (dayNumber) {
            case 0 -> System.out.println("Monday");
            case 1 -> System.out.println("Tuesday");
            case 2 -> System.out.println("Wednesday");
            case 3 -> System.out.println("Thursday");
            case 4 -> System.out.println("Friday");
            case 5 -> System.out.println("Saturday");
            case 6 -> System.out.println("Sunday");
            default -> System.out.println("Number out of range.");
        }
    }

    public static void main(String[] args) {
        printDayInWord();
    }
}
