package io.codelex.oop.exercise10;

import java.math.BigDecimal;

public class Cube extends Shape3D {
    private final BigDecimal facesCount = new BigDecimal(6);
    private final BigDecimal edgesCount = new BigDecimal(12);
    private BigDecimal oneEdgeHeight;

    public Cube(BigDecimal oneEdgeHeight) {
        this.oneEdgeHeight = oneEdgeHeight;
    }

    @Override
    protected BigDecimal calculatePerimeter() {
        return oneEdgeHeight.multiply(edgesCount);
    }

    @Override
    protected BigDecimal calculateArea() {
        return oneEdgeHeight.pow(2).multiply(facesCount);
    }

    @Override
    protected BigDecimal calculateVolume() {
        return oneEdgeHeight.pow(3);
    }
}
