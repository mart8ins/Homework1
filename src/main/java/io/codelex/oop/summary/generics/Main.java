package io.codelex.oop.summary.generics;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Combiner combiner = new Combiner<>(4, 4);
        System.out.println(combiner.combineTwoItems(combiner.getFirst(), combiner.getSecond()));

        Combiner combiner1 = new Combiner<>("Hello", "World");
        System.out.println(combiner1.combineTwoItems(combiner1.getFirst(), combiner1.getSecond()));

        Printer printer = new Printer(200L);
        printer.print();

        Printer printer1 = new Printer("Hellloooooo!");
        printer1.print();

        StorageHouse storageHouse = new StorageHouse();
        storageHouse.addMoreItems(100L);
        storageHouse.addMoreItems(new BigDecimal(200));
        storageHouse.addMoreItems(true);
        storageHouse.printItems();

    }
}
