package io.codelex.oop.summary.exercise2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    List<SellableThing> items = new ArrayList<>();

    public void addItem(SellableThing item) throws BadFoodException {
        if (item instanceof FoodItem) {
            if (LocalDate.now().isAfter(((FoodItem) item).getBestBefore())) {
                throw new BadFoodException("This food item is expired.");
            }
        }
        items.add(item);
    }

    public void showItems() {
        for (SellableThing item : items) {
            item.getFullInfo();
        }
    }
}
