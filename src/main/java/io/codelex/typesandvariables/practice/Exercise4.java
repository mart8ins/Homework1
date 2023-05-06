package io.codelex.typesandvariables.practice;

public class Exercise4 {

    private static void printNameAndAge(String name, int birthYear) {
        System.out.printf("My name is %s and I was born in %s.", name, birthYear);
    }

    public static void main(String[] args) {
        printNameAndAge("Martins", 1986);
    }
}
