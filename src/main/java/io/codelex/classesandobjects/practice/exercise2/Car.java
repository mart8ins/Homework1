package io.codelex.classesandobjects.practice.exercise2;

public class Car {
    private double startKilometers; // Starting odometer reading
    private double endKilometers; // Ending odometer reading
    private double liters; // Liters of gas used between the readings


    public Car(double startKilometers) {
        this.startKilometers = startKilometers;
    }

    private double calculateLitersPer100Kilometers() {
        return (liters * 100) / (endKilometers - startKilometers);
    }

    public double calculateConsumption() {
        double litersPerHundredKilometers = calculateLitersPer100Kilometers();
        startKilometers = endKilometers;
        return 100 / litersPerHundredKilometers;
    }

    public boolean gasHog() {
        if (calculateLitersPer100Kilometers() >= 15) {
            return true;
        } else {
            return false;
        }
    }

    public boolean economyCar() {
        if (calculateLitersPer100Kilometers() <= 5) {
            return true;
        } else {
            return false;
        }
    }

    public void fillUp(int milage, double liters) {
        this.endKilometers = milage;
        this.liters = liters;
    }
}
