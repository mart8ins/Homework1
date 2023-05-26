package io.codelex.oop.exercise3;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Exercise3 {
    public static void main(String[] args) {
        List<Manufacturer> manufacturerList = new ArrayList<>();
        List<Manufacturer> manufacturerList2 = new ArrayList<>();

        Manufacturer manufacturer = new Manufacturer("Solar", 1999, "Latvia");
        Manufacturer manufacturer1 = new Manufacturer("Skruvze", 1995, "Gana");

        Manufacturer manufacturer2 = new Manufacturer("Riepzoo", 2010, "Japan");
        Manufacturer manufacturer3 = new Manufacturer("JoJo", 2015, "Italy");
        Manufacturer manufacturer4 = new Manufacturer("Kukuuu", 1990, "France");

        manufacturerList.add(manufacturer);
        manufacturerList.add(manufacturer1);

        manufacturerList2.add(manufacturer2);
        manufacturerList2.add(manufacturer3);
        manufacturerList2.add(manufacturer4);

        Car car = new Car("Audi", "A4", new BigDecimal(10000), 2018, manufacturerList, EngineType.V12);
        Car car2 = new Car("Bmw", "520", new BigDecimal(19800), 1995, manufacturerList2, EngineType.S3);
        Car car3 = new Car("VW", "Passat", new BigDecimal(23800), 2023, manufacturerList2, EngineType.V6);

        CarService carService = new CarService();
        carService.addCar(car);
        carService.addCar(car2);
        carService.addCar(car3);

        // GET ALL CARS
//        System.out.println(carService.getCars());

        // GET CAR BY ENGINE
//        System.out.println(carService.getCarsWithEngine(EngineType.V12));

        // GET CAR PRODUCED BEFORE...
//        System.out.println(carService.getCarsBeforeDate(1999));

        // GET MOST EXPENSIVE CAR
//        System.out.println(carService.getMostExpensiveCar());

        // GET CHEAPEST CAR
//        System.out.println(carService.getCheapestCar());

        // GET CARS WITH AT LEAST 3 MANUFACTURERS
//        System.out.println(carService.getCarsWithAtLeast3Manufacturers());

        // GET SORTED LIST OF CARS ASCENDING/DESCENDING
//        System.out.println(carService.getSortedCars("descending"));

        // CHECKING AND RETURNING IF SPECIFIC CAR BY NAME AND MODEL EXISTS
//        System.out.println(carService.getACar("Audi", "A4"));

        // RETURNING ALL CARS WHAT HAVE ONE SPECIFIC MANUFACTURER IN THEIR LIST
//        System.out.println(carService.getCarsWithManufacturer("JoJo"));

        // RETUNING SET/LIST OF CARS DEPENDING ON FILTERING YEAR OF ESTABLISHMENT
//        System.out.println(carService.getCarsFilteredByManufacturerYearOfEstablishment(">", 2000));

        // REMOVING CAR
//        carService.removeCar(car3);
//        System.out.println(carService.getCars());

    }
}
