package io.codelex.oop.exercise3;

import java.util.*;

public class CarService {
    private List<Car> cars = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
    }

    public void removeCar(Car car) {
        cars.remove(car);
    }

    public List<Car> getCars() {
        return cars;
    }

    public List getCarsWithEngine(EngineType engineType) {
        List<Car> carsWithEngine = new ArrayList();
        for (Car car : cars) {
            if (car.getEngineType().equals(engineType)) {
                carsWithEngine.add(car);
            }
        }
        return carsWithEngine;
    }

    public List getCarsBeforeDate(int year) {
        List<Car> carsBeforeYear = new ArrayList();
        for (Car car : cars) {
            if (car.getYearOfManufacture() < year) {
                carsBeforeYear.add(car);
            }
        }
        return carsBeforeYear;
    }

    public Car getMostExpensiveCar() {
        Car mostExpensiveCar = null;
        for (Car car : cars) {
            if (mostExpensiveCar == null) {
                mostExpensiveCar = car;
            } else {
                if (car.getPrice().compareTo(mostExpensiveCar.getPrice()) == 1) {
                    mostExpensiveCar = car;
                }
            }

        }
        return mostExpensiveCar;
    }

    public Car getCheapestCar() {
        Car cheapestCar = null;
        for (Car car : cars) {
            if (cheapestCar == null) {
                cheapestCar = car;
            } else {
                if (car.getPrice().compareTo(cheapestCar.getPrice()) == -1) {
                    cheapestCar = car;
                }
            }

        }
        return cheapestCar;
    }

    public List getCarsWithAtLeast3Manufacturers() {
        List<Car> carsWithAtLeast3Manufacturers = new ArrayList<>();
        for (Car car : cars) {
            if (car.getManufacturers().size() >= 3) {
                carsWithAtLeast3Manufacturers.add(car);
            }

        }
        return carsWithAtLeast3Manufacturers;
    }

    public List getSortedCars(String order) {
        if (order.equals("ascending")) {
            Collections.sort(cars, Comparator.comparing(Car::getName));
        } else {
            Collections.sort(cars, (Car a, Car b) -> b.getName().compareTo(a.getName()));
        }
        return cars;
    }

    public Car getACar(String name, String model) {
        Car found = null;
        for (Car car : cars) {
            if (car.getName().equals(name) && car.getModel().equals(model)) {
                found = car;
            }
        }
        return found;
    }

    public List getCarsWithManufacturer(String manufacturer) {
        List manufacturedBy = new ArrayList<>();
        for (Car car : cars) {
            List<Manufacturer> m = car.getManufacturers();
            for (Manufacturer manuf : m) {
                if (manufacturer.equals(manuf.getName())) {
                    manufacturedBy.add(car);
                }
            }
        }
        return manufacturedBy;
    }

    public Set getCarsFilteredByManufacturerYearOfEstablishment(String operator, int year) {
        Set<Car> manufacturYearOfEstablishment = new HashSet<>();
        for (Car car : cars) {
            List<Manufacturer> m = car.getManufacturers();
            for (Manufacturer manuf : m) {
                if (filterCarsByOperator(manuf, year, operator)) {
                    manufacturYearOfEstablishment.add(car);
                }
            }
        }
        return manufacturYearOfEstablishment;
    }

    private boolean filterCarsByOperator(Manufacturer m, int year, String operator) {
        boolean success = false;
        switch (operator) {
            case ">=" -> {
                if (m.getYearOfEstablishment() >= year) success = true;
            }
            case "<=" -> {
                if (m.getYearOfEstablishment() <= year) success = true;
            }
            case ">" -> {
                if (m.getYearOfEstablishment() > year) success = true;
            }
            case "<" -> {
                if (m.getYearOfEstablishment() < year) success = true;
            }
            case "=" -> {
                if (m.getYearOfEstablishment() == year) success = true;
            }
            case "!=" -> {
                if (m.getYearOfEstablishment() != year) success = true;
            }
        }
        return success;
    }

}
