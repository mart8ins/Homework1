package io.codelex.arithmetic.practice;

public class Exercise8 {
    private static void calculatePay(double pay, int hours) {
        double overtimeRate = 1.5d;
        double overtimeHours = hours - 40;
        double baseHours = hours - overtimeHours;
        double basePay = baseHours * pay;
        double overtTimePay = overtimeHours * (pay * overtimeRate);
        double totalPay = basePay + overtTimePay;

        if (hours > 60) {
            System.out.println("Error - Employee should not work more than 60 hours per week.");
        } else if (pay < 8.00) {
            System.out.println("Error - Minimum wage cannot be less than $8.00 an hour.");
        } else {
            System.out.printf("Employee worked %s hours from which %.0f was overtime hours. Total paid salary is $%.2f (from which $%.2f is for overtime hours). \n", hours, overtimeHours, totalPay, overtTimePay);
        }


    }

    public static void main(String[] args) {
        calculatePay(7.50, 35);
        calculatePay(8.20, 40);
        calculatePay(10.00, 73);
    }
}
