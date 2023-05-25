package io.codelex.oop.exercise1;

import java.math.BigDecimal;

public abstract class Shape {
    private BigDecimal numSides;

    public Shape(BigDecimal numSides) {
        this.numSides = numSides;
    }

    public BigDecimal getNumSides() {
        return this.numSides;
    }

    public abstract BigDecimal getArea();

    public abstract BigDecimal getPerimeter();


}
