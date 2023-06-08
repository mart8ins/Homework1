package io.codelex.polymorphism.practice.exercise1;

public class Honda implements Car {
    private String name = "Honda";
    private Integer currentSpeed = 0;

    public String getName() {
        return name;
    }

    public Integer getCurrentSpeed() {
        return currentSpeed;
    }

    public void speedUp() {
        currentSpeed += 7;
    }

    public void slowDown() {
        currentSpeed -= 7;
    }

    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

}
