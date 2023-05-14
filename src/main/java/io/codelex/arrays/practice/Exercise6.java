package io.codelex.arrays.practice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Exercise6 {
    private static int[] createArray() {
        int[] arr = IntStream.rangeClosed(1, 10).toArray();
        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            arr[i] = random.nextInt(100) + 1;
        }
        return arr;
    }

    ;

    public static void main(String[] args) {
        int[] arr1 = createArray();
        int[] arr2 = createArray();

        System.out.println("Array 1 " + Arrays.toString(arr1));
        System.out.println("Array 2 " + Arrays.toString(arr2));
    }
}
