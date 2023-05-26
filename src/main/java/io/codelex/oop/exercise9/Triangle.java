package io.codelex.oop.exercise9;

import java.math.BigDecimal;

public class Triangle extends Shape {
    private BigDecimal base;
    private BigDecimal height;


    public Triangle(BigDecimal base, BigDecimal height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public BigDecimal calculatePerimeter() {
        return height.add(height).add(base);
    }

    @Override
    public BigDecimal calculateArea() {
        return height.multiply(base).divide(new BigDecimal(2));
    }
}
