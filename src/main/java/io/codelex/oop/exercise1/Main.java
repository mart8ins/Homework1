package io.codelex.oop.exercise1;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(new BigDecimal(4), new BigDecimal(3), new BigDecimal(2));
        Triangle triangle = new Triangle(new BigDecimal(3), new BigDecimal(7), new BigDecimal(4));

        ICalculate calculateRectanglePerimeter = Calculate::rectangularPerimeter;
        ICalculate calculateRectangleArea = Calculate::rectangularArea;
        ICalculate calculateTrianglePerimeter = Calculate::trianglePerimeter;
        ICalculate calculateTriangleArea = Calculate::triangleArea;

        System.out.println(rectangle.getPerimeter(calculateRectanglePerimeter));
        System.out.println(rectangle.getArea(calculateRectangleArea));
        System.out.println(triangle.getPerimeter(calculateTrianglePerimeter));
        System.out.println(triangle.getArea(calculateTriangleArea));
    }


}
