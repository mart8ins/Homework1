package io.codelex.polymorphism.practice.exercise6;

public class Cat extends Felime {
    private String breed;

    public Cat(String animalName, String animalType, Double animalWeight, int foodEaten, String livingRegion, String breed) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
        this.breed = breed;
    }

    @Override
    void makeSound() {
        System.out.println("Meow!!!!");
    }

    @Override
    void eat(Food food) {
        foodEaten = food.getQuantity();
    }

    @Override
    public String toString() {
        return "Cat[" +
                animalName + ", " +
                breed + ", " +
                animalWeight + ", " +
                livingRegion + ", " +
                foodEaten + "] ";
    }
}
