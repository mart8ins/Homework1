package io.codelex.enums.practice.exercise1;

public enum Directions {
    NORTH("up"),
    EAST("right"),
    SOUTH("down"),
    WEST("left");

    private String direction;

    Directions(String direction) {
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }
}
