package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class LargestNumber {

    private static void largestNumber(int a, int b, int c) {
        String largest = "Largest number is: ";
        if (a > b && a > c) {
            largest += a;
        } else if (b > a && b > c) {
            largest += b;
        } else {
            largest += c;
        }
        System.out.println(largest);
    }

    //TODO: Write a Java program to to find the largest of three numbers.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input the 1st number: ");
        int num1 = in.nextInt();

        System.out.print("Input the 2nd number: ");
        int num2 = in.nextInt();

        System.out.print("Input the 3rd number: ");
        int num3 = in.nextInt();

        /*
        todo - expected output:
        Input the 1st number: 25
        Input the 2nd number: 78
        Input the 3rd number: 87
         */
        largestNumber(num1, num2, num3);
    }

}
