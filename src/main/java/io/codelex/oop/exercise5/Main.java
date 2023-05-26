package io.codelex.oop.exercise5;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        System.out.println(MeasurementConverter.convert(new BigDecimal(10), ConversionType.METERS_TO_YARDS));
        System.out.println(MeasurementConverter.convert(new BigDecimal(10), ConversionType.YARDS_TO_METERS));
        System.out.println(MeasurementConverter.convert(new BigDecimal(10), ConversionType.CENTIMETERS_TO_INCHES));
        System.out.println(MeasurementConverter.convert(new BigDecimal(10), ConversionType.INCHES_TO_CENTIMETERS));
        System.out.println(MeasurementConverter.convert(new BigDecimal(10), ConversionType.KILOMETERS_TO_MILES));
        System.out.println(MeasurementConverter.convert(new BigDecimal(10), ConversionType.MILES_TO_KILOMETERS));
    }
}
