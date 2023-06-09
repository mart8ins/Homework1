package io.codelex.oop.summary.exercise2;

public class ElectronicsItem extends AbstractItem {
    private int power;

    public ElectronicsItem(String name, double price, int power) {
        super(name, price);
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String getFullInfo() {
        return name + ", " + price + " EUR" + ", power: " + power + "W";
    }
}
