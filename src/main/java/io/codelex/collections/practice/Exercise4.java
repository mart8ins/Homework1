package io.codelex.collections.practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Set<String> names = new HashSet<>();
        System.out.println("Please add the name to the list or pleas empty enter to quit and see all names.");

        while (true) {
            String name = in.nextLine();
            if (name.equals("")) break;
            names.add(name);
        }

        System.out.println(names);
    }
}
