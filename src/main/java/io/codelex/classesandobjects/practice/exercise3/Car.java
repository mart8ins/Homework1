package io.codelex.classesandobjects.practice.exercise3;

public class Car {
    public static void main(String[] args) {
        FuelGauge fuelGauge = new FuelGauge();
        Odometer odometer = new Odometer();
        
        System.out.println(fuelGauge.getReport());
        for (int i = 0; i < fuelGauge.getMaxCapacity(); i++) {
            fuelGauge.fillUpTank();
        }
        System.out.println("Filling up...");
        System.out.println(fuelGauge.getReport());

        System.out.println("Lets drive...");

        while (fuelGauge.getCurrentAmount() > 0) {
            for (int i = 0; i < 10; i++) {
                odometer.increaseMileage();
            }
            fuelGauge.burnTank();

            System.out.println(odometer.getMileageReport());
            System.out.println(fuelGauge.getReport());
        }

    }
}
