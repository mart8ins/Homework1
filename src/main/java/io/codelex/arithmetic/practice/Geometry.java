package io.codelex.arithmetic.practice;

import io.codelex.NoCodeWrittenException;

import java.math.BigDecimal;

class Geometry {
    static double areaOfCircle(double radius) {
        if (radius <= 0) {
            throw new RuntimeException("Please provide positive value.");
        } else {
            return Math.PI * Math.pow(radius, 2);
        }
    }

    static double areaOfRectangle(double length, double width) {
        if (length <= 0 || width <= 0) {
            throw new RuntimeException("Please provide positive value.");
        } else {
            return length * width;
        }
    }

    static double areaOfTriangle(double base, double h) {
        if (base <= 0 || h <= 0) {
            throw new RuntimeException("Please provide positive value.");
        } else {
            return base * h * 0.5;
        }
    }
}
