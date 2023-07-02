package io.codelex.collections.practice.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExercise11 {

    public static void main(String[] args) {
        //TODO: Create an ArrayList with String elements
        List<String> myArray = new ArrayList<String>();

        //TODO: Add 10 values to list
        myArray.add("ONE");
        myArray.add("TWO");
        myArray.add("THREE");
        myArray.add("FOUR");
        myArray.add("FIVE");
        myArray.add("SIX");
        myArray.add("SEVEN");
        myArray.add("EIGHT");
        myArray.add("NINE");
        myArray.add("TEN");

        //TODO: Add new value at 5th position
        myArray.add(4, "NINETEEN");

        //TODO: Change value at last position (Calculate last position programmatically)
        myArray.indexOf("TEN");
        myArray.add(myArray.indexOf("TEN"), "FIFTY");

        //TODO: Sort your list in alphabetical order
        Collections.sort(myArray);

        //TODO: Check if your list contains "Foobar" element
        if (myArray.contains("Foobar")) {
            System.out.println("It contains Foobar.");
        } else {
            System.out.println("Its does not contain Foobar.");
        }

        //TODO: Print each element of list using loop
        for (String element : myArray) {
            System.out.println(element);
        }
    }

}
