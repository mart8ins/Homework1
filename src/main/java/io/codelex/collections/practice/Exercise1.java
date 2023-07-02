package io.codelex.collections.practice;

import java.util.*;

/**
 * Origination:
 * Audi -> Germany
 * BMW -> Germany
 * Honda -> Japan
 * Mercedes -> Germany
 * Volkswagen -> Germany
 * Tesla -> USA
 */
public class Exercise1 {
    public static void main(String[] args) {
        String[] array = {"Audi", "BMW", "Honda", "Mercedes", "Volkswagen", "Mercedes", "Tesla"};

        //todo - replace array with an ArrayList and print out the results
        List<String> newArray = new ArrayList<String>();
        for (int i = 0; i < array.length; i++) {
            newArray.add(array[i]);
        }
        System.out.println(newArray);


        //todo - replace array with a HashSet and print out the results
        Set<String> newSet = new HashSet<String>();
        for (int i = 0; i < array.length; i++) {
            newSet.add(array[i]);
        }
        System.out.println(newSet);

        //todo - replace array with a HashMap (use brand as key and origination as value) an print out the results
        Map<String, String> newMap = new HashMap<String, String>();
        newMap.put("Audi", "Germany");
        newMap.put("BMW", "Germany");
        newMap.put("Honda", "Japan");
        newMap.put("Mercedes", "Germany");
        newMap.put("Volkswagen", "Germany");
        newMap.put("Tesla", "USA");
        System.out.println(newMap);

    }
}
