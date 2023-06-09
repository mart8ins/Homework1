package io.codelex.oop.summary.exercise2;

import java.time.LocalDate;

public class FoodItem extends AbstractItem {
    private LocalDate bestBefore;

    public FoodItem(String name, double price, LocalDate bestBefore) {
        super(name, price);
        this.bestBefore = bestBefore;
    }

    public LocalDate getBestBefore() {
        return bestBefore;
    }

    public void setBestBefore(LocalDate bestBefore) {
        this.bestBefore = bestBefore;
    }

    @Override
    public String getFullInfo() {
        return name + ", " + price + " EUR" + ", best before: " + bestBefore;
    }
}
