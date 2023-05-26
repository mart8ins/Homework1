package io.codelex.oop.exercise5;

import java.math.BigDecimal;

public class MeasurementConverter {
    public static String convert(BigDecimal value, ConversionType type) {
        BigDecimal result = value.multiply(new BigDecimal(type.ratio));
        return String.format("%.2f", result);
    }

}
