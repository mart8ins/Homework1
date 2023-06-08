package io.codelex.polymorphism.practice.exercise6;

public abstract class Mammal extends Animal {
    protected String livingRegion;

    public Mammal(String animalName, String animalType, Double animalWeight, int foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten);
        this.livingRegion = livingRegion;
    }

    public String getLivingRegion() {
        return livingRegion;
    }

    public void setLivingRegion(String livingRegion) {
        this.livingRegion = livingRegion;
    }
}
