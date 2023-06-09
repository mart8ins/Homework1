package io.codelex.oop.summary.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Order {
    List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public void showItems() {
        for (Item item : items) {
            item.getFullInfo();
        }
    }
}
