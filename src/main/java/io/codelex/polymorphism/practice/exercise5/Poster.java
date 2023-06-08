package io.codelex.polymorphism.practice.exercise5;

public class Poster extends Advert {
    private double height;
    private double width;
    private int copies;
    private int costPerCopy;

    public Poster(int fee, double height, double width, int copies, int costPerCopy) {
        super(fee);
        this.height = height;
        this.width = width;
        this.copies = copies;
        this.costPerCopy = costPerCopy;
    }

    @Override
    public int cost() {
        return super.cost() + (copies * costPerCopy);
    }

    @Override
    public String toString() {
        return super.toString() + " Poster size:" +
                "height=" + height +
                ", width=" + width +
                ", copies=" + copies +
                ", costPerCopy=" + costPerCopy;
    }
}
