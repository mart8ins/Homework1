package io.codelex.arrays.practice;

public class Exercise3 {

    //TODO: Write a Java program to calculate the average value of array elements.
    public static void main(String[] args) {
        int[] numbers = {20, 30, 25, 35, -16, 60, -100};
        double average;
        int sum = 0;

//        fixme - calculate sum of all array elements
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        
//        fixme - calculate average value
        average = (double) sum / numbers.length;
        System.out.println("Average value of the array elements is : " + average);
    }
}
