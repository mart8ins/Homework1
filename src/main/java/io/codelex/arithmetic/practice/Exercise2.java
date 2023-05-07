package io.codelex.arithmetic.practice;

public class Exercise2 {
    private static void CheckOddEven(int num) {
        if (num % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }

        System.out.println("bye!");
    }

    public static void main(String[] args) {
        CheckOddEven(8);
    }
}
