package io.codelex.oop.summary.exercise1;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        LazyBox<Integer> box = new LazyBox<>(Main::calculate);
        Integer c = box.get();
        Integer b = box.get();
        System.out.println(c);
        System.out.println(b);
    }

    public static Integer calculate() {
        return 200;
    }
}
