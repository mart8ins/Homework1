package io.codelex.polymorphism.practice.exercise6;

public class Meat extends Food {
    public Meat(int quantity) {
        super(quantity);
    }

    @Override
    public String toString() {
        return "Meat " + quantity;
    }
}
