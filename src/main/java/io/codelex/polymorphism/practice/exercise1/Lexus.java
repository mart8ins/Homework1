package io.codelex.polymorphism.practice.exercise1;

public class Lexus implements Car {
    private String name = "Lexus";
    private Integer currentSpeed = 0;

    public String getName() {
        return name;
    }

    public Integer getCurrentSpeed() {
        return currentSpeed;
    }

    public void speedUp() {
        currentSpeed += 8;
    }

    public void slowDown() {
        currentSpeed -= 8;
    }

    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    public void useNitrousOxideEngine() {
        currentSpeed = currentSpeed + 30;
    }


}
