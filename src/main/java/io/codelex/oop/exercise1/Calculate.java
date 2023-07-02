package io.codelex.oop.exercise1;

import java.math.BigDecimal;

public class Calculate {
    public static BigDecimal rectangularPerimeter(BigDecimal width, BigDecimal height) {
        return width.add(height).multiply(new BigDecimal(2));
    }

    public static BigDecimal rectangularArea(BigDecimal width, BigDecimal height) {
        return width.multiply(height);
    }

    public static BigDecimal trianglePerimeter(BigDecimal width, BigDecimal height) {
        return height.multiply(new BigDecimal(2)).add(width);
    }

    public static BigDecimal triangleArea(BigDecimal width, BigDecimal height) {
        return width.multiply(height).divide(new BigDecimal(2));
    }
}
