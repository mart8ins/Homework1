package io.codelex.syntax.arithmetics;

import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("");
            System.out.println("Enter the two numbers to perform operations ");
            System.out.print("Enter the first number : ");
            int x = s.nextInt();
            System.out.print("Enter the second number : ");
            int y = s.nextInt();
            System.out.println("Choose the operation you want to perform ");
            System.out.println("Choose 1 for ADDITION");
            System.out.println("Choose 2 for SUBTRACTION");
            System.out.println("Choose 3 for MULTIPLICATION");
            System.out.println("Choose 4 for DIVISION");
            System.out.println("Choose 5 for MODULUS");
            System.out.println("Choose 6 for EXIT");
            int n = s.nextInt();
            switch (n) {
                case 1:
                    /*
                    int add;
                    add = ?;
                    System.out.println("Result : " + add);                    
                     */
                    break;
                case 2:
                    /*
                    int sub;
                    sub = ?;
                    System.out.println("Result : " + sub);
                    */
                    break;
                case 3:
                    /*
                    int mul;
                    mul = ?;
                    System.out.println("Result : " + mul);
                    */
                    break;
                case 4:
                    /*
                    float div;
                    div = ?;
                    System.out.print("Result : " + div);
                    */
                    break;
                case 5:
                    /*
                    int mod;
                    mod = ?;
                    System.out.println("Result : " + mod);
                    */
                    break;
                case 6:
                    System.exit(0);
            }
        }
    }
}
