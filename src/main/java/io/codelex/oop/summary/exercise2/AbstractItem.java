package io.codelex.oop.summary.exercise2;

public abstract class AbstractItem implements Item {

    protected String name;
    protected double price;

    public AbstractItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract String getFullInfo();
}
