package io.codelex.arithmetic.practice;

public class Exercise1 {
    private static boolean check15(int a, int b) {
        if (a == 15 || b == 15) {
            return true;
        } else if (a + b == 15) {
            return true;
        } else if (a - 15 == b || b - 15 == a) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(check15(10, 25));
    }
}
