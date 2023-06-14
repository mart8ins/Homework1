package io.codelex.test14June.exercise5;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Peter", "Angelina", "Bravo");
        double percent = partOf(names, (String name) -> name.length() > 4);
        System.out.println(percent);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        double evenPercent = partOf(numbers, (Integer n) -> n % 2 == 1);
        System.out.println(evenPercent);
    }

    public static <E, F> double partOf(List<E> elements, Predicate<? super F> predicate) {
        List<E> a = elements.stream().filter((Predicate<? super E>) predicate).collect(Collectors.toList());
        return ((double) a.size() / elements.size());
    }
}
