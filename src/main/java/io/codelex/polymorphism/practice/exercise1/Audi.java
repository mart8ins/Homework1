package io.codelex.polymorphism.practice.exercise1;

public class Audi implements Car {
    private String name = "Audi";
    private Integer currentSpeed = 0;

    public String getName() {
        return name;
    }

    public Integer getCurrentSpeed() {
        return currentSpeed;
    }

    public void speedUp() {
        currentSpeed += 10;
    }

    public void slowDown() {
        currentSpeed -= 10;
    }

    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

}
