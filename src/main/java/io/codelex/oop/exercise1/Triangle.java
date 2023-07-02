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
    public BigDecimal getArea(ICalculate fn) {
        return fn.calculate(this.width, this.height);
    }

    @Override
    public BigDecimal getPerimeter(ICalculate fn) {
        return fn.calculate(this.width, this.height);
    }
}
