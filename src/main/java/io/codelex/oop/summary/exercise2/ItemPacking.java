package io.codelex.oop.summary.exercise2;

public class ItemPacking implements Service {
    private static final String name = "Item packing";
    private static final int price = 5;


    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getFullInfo() {
        return name + ", " + price + " EUR";

    }
}
