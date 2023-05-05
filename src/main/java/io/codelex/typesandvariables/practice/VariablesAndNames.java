package io.codelex.typesandvariables.practice;

public class VariablesAndNames {
    public static void main(String[] args) {
        int cars = 100;
        int drivers = 30;
        int passengers = 90;
        int carsNotDriven = cars - drivers; // free cars
        int carsDriven = drivers;
        int averagePassengersPerCar = passengers / carsDriven;
        double carpoolCapacity;
        double seatsInACar = 4.0;

        /*
        Task condition was - Keep two digits after decimal separator - so below carpoolCapacity was the only place
        where generates decimals, so i kept it how it is and used printf to print value with 2 decimals after separator
        * */
        carpoolCapacity = carsDriven * seatsInACar;

        System.out.println("There are " + cars + " cars available.");
        System.out.println("There are only " + drivers + " drivers available.");
        System.out.println("There will be " + carsNotDriven + " empty cars today.");
        System.out.printf("We can transport %.2f people today. \n", carpoolCapacity);
        System.out.println("We have " + passengers + " passengers to carpool today.");
        System.out.println("We need to put about " + averagePassengersPerCar + " passengers in each car.");
    }
}