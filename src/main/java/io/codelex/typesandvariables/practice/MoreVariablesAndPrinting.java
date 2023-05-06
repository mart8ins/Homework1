package io.codelex.typesandvariables.practice;

import java.util.Locale;

public class MoreVariablesAndPrinting {
    static double onePoundToKg = 0.453592d;
    static double oneInchToCm = 2.54d;

    public static double convertWeight(int w) {
        return w * onePoundToKg;
    }

    public static double convertHeight(int h) {
        return h * oneInchToCm;
    }

    public static void main(String[] args) {
        String name = "Zed A. Shaw";
        String eyes = "Blue";
        String teeth = "White";
        String hair = "Brown";
        int age = 35;
        int height = 74; // inches
        int weight = 180; // lbs

        // Convert inches to centimeters and pounds to kilograms
        double weightInKg = convertWeight(weight);
        double heightInCm = convertHeight(height);

        System.out.println("Let's talk about " + name + ".");
        System.out.printf("He's %.2f centimeters tall. \n", heightInCm);
        System.out.printf("He's %.2f kilograms heavy. \n", weightInKg);
        System.out.println("Actually, that's not too heavy.");
        System.out.println("He's got " + eyes + " eyes and " + hair + " hair.");
        System.out.println("His teeth are usually " + teeth + " depending on the coffee.");
        
        System.out.printf(Locale.US, "If I add %s, %.2f, and %.2f I get %.2f.", age, heightInCm, weightInKg, (age + heightInCm + weightInKg));
    }
}