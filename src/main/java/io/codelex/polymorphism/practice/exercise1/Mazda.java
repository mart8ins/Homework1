package io.codelex.polymorphism.practice.exercise1;

public class Mazda implements Car {
    private String name = "Mazda";
    private Integer currentSpeed = 0;

    public String getName() {
        return name;
    }

    public Integer getCurrentSpeed() {
        return currentSpeed;
    }

    public void speedUp() {
        currentSpeed += 5;
    }

    public void slowDown() {
        currentSpeed -= 5;
    }

    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    public void useNitrousOxideEngine() {
        currentSpeed = currentSpeed + 25;
    }
}
