package io.codelex.arithmetic.practice;

public class SumAverageRunningInt {

    private static void calculateSum(int lower, int upper) {
        int sum = 0;
        double average;
        int lowerBound = lower;
        int upperBound = upper;

        for (int number = lowerBound; number <= upperBound; ++number) {
            sum += number;
        }
        average = sum / (double) upper;

        System.out.printf("The sum of %s and %s is %s \n", lower, upper, sum);
        System.out.printf("The average is %s", average);
    }

    public static void main(String[] args) {
        calculateSum(1, 100);
    }
}
