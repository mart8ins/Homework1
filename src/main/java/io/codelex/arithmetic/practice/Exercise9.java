package io.codelex.arithmetic.practice;

public class Exercise9 {
    private static void calculateBmi(double height, double weight) {
        double bmi = weight / Math.pow(height, 2);
        if (bmi < 18.50) {
            System.out.printf("Your BMI is %.0f so you are underweight. \n", bmi);
        } else if (bmi > 25) {
            System.out.printf("Your BMI is %.0f so you are overweight. \n", bmi);
        } else {
            System.out.printf("Your BMI is %.0f and your weight is considered optimal for your height. \n", bmi);
        }
    }

    public static void main(String[] args) {
        calculateBmi(1.86, 79.00);
    }
}
