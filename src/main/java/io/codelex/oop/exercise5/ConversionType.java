package io.codelex.oop.exercise5;

public enum ConversionType {
    METERS_TO_YARDS(1.0936),
    YARDS_TO_METERS(0.9144),
    CENTIMETERS_TO_INCHES(0.393701),
    INCHES_TO_CENTIMETERS(2.54),
    KILOMETERS_TO_MILES(0.621371),
    MILES_TO_KILOMETERS(1.609344);

    double ratio;

    ConversionType(double ratio) {
        this.ratio = ratio;
    }
}
