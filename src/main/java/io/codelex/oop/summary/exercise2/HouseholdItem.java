package io.codelex.oop.summary.exercise2;

public class HouseholdItem extends AbstractItem {
    private String color;

    public HouseholdItem(String name, double price, String color) {
        super(name, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String getFullInfo() {
        return name + ", " + price + " EUR" + ", color: " + color;
    }
}
