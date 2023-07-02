package io.codelex.oop.exercise10;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Cone cone = new Cone(new BigDecimal(20), new BigDecimal(10));
        System.out.printf("%.2f\n", cone.calculatePerimeter());
        System.out.printf("%.2f\n", cone.calculateArea());
        System.out.printf("%.2f\n", cone.calculateVolume());

        Cube cube = new Cube(new BigDecimal(7));
        System.out.println(cube.calculatePerimeter());
        System.out.println(cube.calculateArea());
        System.out.println(cube.calculateVolume());

    }
}
