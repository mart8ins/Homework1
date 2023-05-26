package io.codelex.oop.exercise9;

import java.math.BigDecimal;

public class Rectangle extends Shape {
    private BigDecimal xSide;
    private BigDecimal ySide;

    public Rectangle(BigDecimal xSide, BigDecimal ySide) {
        this.xSide = xSide;
        this.ySide = ySide;
    }


    @Override
    public BigDecimal calculatePerimeter() {
        return xSide.add(ySide).multiply(new BigDecimal(2));
    }

    @Override
    public BigDecimal calculateArea() {
        return xSide.multiply(ySide);
    }
}
