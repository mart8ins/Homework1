package io.codelex.oop.exercise1;

import java.math.BigDecimal;

public class Rectangle extends Shape {

    BigDecimal width;
    BigDecimal height;


    public Rectangle(BigDecimal numSides, BigDecimal width, BigDecimal height) {
        super(numSides);
        this.width = width;
        this.height = height;
    }

    @Override
    public BigDecimal getArea() {
        return this.width.multiply(this.height);
    }

    @Override
    public BigDecimal getPerimeter() {
        return this.width.add(this.height).multiply(new BigDecimal(2));
    }
}
