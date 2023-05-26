package io.codelex.oop.exercise9;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(new BigDecimal(3), new BigDecimal(3));
        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculatePerimeter());

        Triangle triangle = new Triangle(new BigDecimal(4), new BigDecimal(5));
        System.out.println(triangle.calculateArea());
        System.out.println(triangle.calculatePerimeter());

        Hexagon hexagon = new Hexagon(new BigDecimal(6));
        System.out.println(hexagon.calculateArea());
        System.out.println(hexagon.calculatePerimeter());
    }
}
