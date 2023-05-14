package io.codelex.classesandobjects.practice.exercise3;

public class Odometer {
    private final double ODOMETERMAX = 999.999;

    private int mileage;

    public void increaseMileage() {
        if (mileage == ODOMETERMAX) {
            mileage = 0;
        } else {
            mileage++;
        }
    }

    public String getMileageReport() {
        return "You car`s current mileage is " + mileage + " kilometers.";
    }
}
