package io.codelex.oop.summary.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StorageHouse<E> {

    //Fix this class so that storage house can contain other types of objects not only numbers
    //Test the functionality

    List<E> items = new ArrayList<>();

    public StorageHouse() {
    }

    public StorageHouse(E firstItem) {
        items.add(firstItem);
    }

    public void addMoreItems(E item) {
        items.add(item);
    }

    public Optional<E> getMaybeFirstItem() {
        return items.stream().findFirst();
    }

    public void printItems() {
        items.forEach(System.out::println);
    }

}
