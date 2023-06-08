package io.codelex.polymorphism.practice.exercise6;

public class Mouse extends Mammal {
    public Mouse(String animalName, String animalType, Double animalWeight, int foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
    }

    @Override
    void makeSound() {
        System.out.println("Piik piiik...");
    }

    @Override
    void eat(Food food) {
        if (food instanceof Vegetable) {
            foodEaten = food.getQuantity();
        } else {
            System.out.println(this.animalType + " are not eating that type of food!");
        }
    }

    @Override
    public String toString() {
        return "Mouse[" +
                animalName + ", " +
                animalWeight + ", " +
                livingRegion + ", " +
                foodEaten + "] ";
    }
}
