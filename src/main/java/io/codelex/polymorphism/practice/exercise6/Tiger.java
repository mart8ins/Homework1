package io.codelex.polymorphism.practice.exercise6;

public class Tiger extends Felime {
    public Tiger(String animalName, String animalType, Double animalWeight, int foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
    }

    @Override
    void makeSound() {
        System.out.println("GROWWWWW!");
    }

    @Override
    void eat(Food food) {
        if (food instanceof Meat) {
            foodEaten = food.getQuantity();
        } else {
            System.out.println(this.animalType + " are not eating that type of food!");
        }
    }

    @Override
    public String toString() {
        return "Tiger[" +
                animalName + ", " +
                animalWeight + ", " +
                livingRegion + ", " +
                foodEaten + "] ";
    }
}
