package io.codelex.oop.exercise10;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Cone extends Shape3D {
    private final BigDecimal PI = new BigDecimal(Math.PI);

    private final BigDecimal ONE = new BigDecimal(1);
    private final BigDecimal TWO = new BigDecimal(2);
    private final BigDecimal THREE = new BigDecimal(3);

    private BigDecimal height;
    private BigDecimal diameter;
    private BigDecimal radius;


    public Cone(BigDecimal slantHeight, BigDecimal diameter) {
        this.height = slantHeight;
        this.diameter = diameter;
        this.radius = diameter.divide(TWO);
    }

    @Override
    protected BigDecimal calculatePerimeter() {
        return PI.multiply(diameter);
    }

    @Override
    protected BigDecimal calculateArea() {
        MathContext mc = new MathContext(10);
        BigDecimal a = PI.multiply(radius);
        BigDecimal b = radius.pow(2).add(height.pow(2));
        BigDecimal c = b.sqrt(mc);
        return a.multiply(c);
    }

    @Override
    protected BigDecimal calculateVolume() {
        BigDecimal a = ONE.divide(THREE, 3, RoundingMode.HALF_UP);
        BigDecimal b = a.multiply(height);
        BigDecimal c = b.multiply(PI);
        return c.multiply(radius.pow(2));
    }
}
