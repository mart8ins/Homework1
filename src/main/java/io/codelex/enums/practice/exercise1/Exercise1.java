package io.codelex.enums.practice.exercise1;

public class Exercise1 {
    public static void main(String[] args) {

        System.out.println("**** Loop through all values");
        for (Directions direction : Directions.values()) {
            StringBuilder res = new StringBuilder();
            res.append(direction + ":");
            res.append(direction.getDirection() + ":");
            res.append(direction.ordinal());
            System.out.println(res);
        }

        System.out.println("**** Using switch");
        Directions directions = Directions.EAST;
        switch (directions) {
            case NORTH -> System.out.println(Directions.NORTH + ":" + "north" + ":" + directions.ordinal());
            case EAST -> System.out.println(Directions.EAST + ":" + "east" + ":" + directions.ordinal());
            case SOUTH -> System.out.println(Directions.SOUTH + ":" + "south" + ":" + directions.ordinal());
            case WEST -> System.out.println(Directions.WEST + ":" + "left" + ":" + directions.ordinal());
        }

    }
}
