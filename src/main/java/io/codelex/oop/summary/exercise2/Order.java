package io.codelex.oop.summary.exercise2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    List<Item> items = new ArrayList<>();

    public void addItem(Item item) throws BadFoodException {
        if (item instanceof FoodItem) {
            if (LocalDate.now().isAfter(((FoodItem) item).getBestBefore())) {
                throw new BadFoodException("This food item is expired.");
            }
        }
        items.add(item);
    }

    public void showItems() {
        for (Item item : items) {
            item.getFullInfo();
        }
    }
}
