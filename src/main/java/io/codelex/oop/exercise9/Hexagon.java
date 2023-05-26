package io.codelex.oop.exercise9;

import java.math.BigDecimal;
import java.math.MathContext;

public class Hexagon extends Shape {
    private BigDecimal side;

    public Hexagon(BigDecimal size) {
        this.side = size;
    }


    @Override
    BigDecimal calculatePerimeter() {
        return side.multiply(new BigDecimal(6));
    }

    @Override
    BigDecimal calculateArea() {
        BigDecimal a = side.pow(2).multiply(new BigDecimal(3));
        BigDecimal b = new BigDecimal(3).sqrt(new MathContext(3));
        return a.multiply(b).divide(new BigDecimal(2));
    }
}
