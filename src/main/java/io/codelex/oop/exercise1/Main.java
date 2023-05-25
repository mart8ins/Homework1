package io.codelex.oop.exercise1;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(new BigDecimal(4), new BigDecimal(3), new BigDecimal(2));
        Triangle triangle = new Triangle(new BigDecimal(3), new BigDecimal(7), new BigDecimal(4));

        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());

        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());
    }
}
