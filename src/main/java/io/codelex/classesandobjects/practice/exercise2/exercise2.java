package io.codelex.classesandobjects.practice.exercise2;

import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        double startKilometers;
        int endKilometers;
        double liters;
        boolean isGasHog;
        boolean isEconomy;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first reading: ");
        startKilometers = scan.nextDouble();

        System.out.print("Enter second reading: ");
        endKilometers = scan.nextInt();

        System.out.print("Enter liters consumed: ");
        liters = scan.nextDouble();

        Car car = new Car(startKilometers);
        car.fillUp(endKilometers, liters);
        System.out.println("Kilometers per liter are " + car.calculateConsumption());
        isGasHog = car.gasHog();
        isEconomy = car.economyCar();

        if (isGasHog) {
            System.out.println("You should consider to switch to more economic car.");
        }
        if (isEconomy) {
            System.out.println("Nice, your car is very economic.");
        }


        System.out.print("Oh... again gas station... enter millage: ");
        endKilometers = scan.nextInt();
        System.out.print("And liters consumed: ");
        liters = scan.nextDouble();

        car.fillUp(endKilometers, liters);
        System.out.println("Kilometers per liter are " + car.calculateConsumption());

        isGasHog = car.gasHog();
        isEconomy = car.economyCar();

        if (isGasHog) {
            System.out.println("You should consider to switch to more economic car.");
        }
        if (isEconomy) {
            System.out.println("Nice, your car is very economic.");
        }
    }
}
