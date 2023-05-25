package io.codelex.oop.exercise1;

import java.math.BigDecimal;

public class Triangle extends Shape {

    BigDecimal width;
    BigDecimal height;

    public Triangle(BigDecimal numSides, BigDecimal width, BigDecimal height) {
        super(numSides);
        this.width = width;
        this.height = height;
    }

    @Override
    public BigDecimal getArea() {
        return this.width.multiply(this.height).divide(new BigDecimal(2));
    }

    @Override
    public BigDecimal getPerimeter() {
        return this.height.add(this.height).add(this.width);
    }
}
