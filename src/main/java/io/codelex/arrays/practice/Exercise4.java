package io.codelex.arrays.practice;

import java.util.Arrays;

public class Exercise4 {

    //TODO: Write a Java program to test if an array contains a specific value.

    private static void findValue(int[] arr, int num) {
        String message = "Value not found.";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                message = "Contains";

            }
        }
        System.out.println(message);
    }

    ;

    public static void main(String[] args) {
        int[] myArray = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2265, 1457, 2456
        };

//        fixme - check if contains number 1245
        findValue(myArray, 1245);

    }
}
