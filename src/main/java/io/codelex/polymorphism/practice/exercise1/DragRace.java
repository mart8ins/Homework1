package io.codelex.polymorphism.practice.exercise1;

import java.util.*;

/**
 * Take a look at the cars in this package.
 * 1. Extract common behaviour to an interface called Car, and use it in the all classes.
 * Which methods will be extracted with an empty body, and which can be default?
 * 2. Create two more cars of your own choice.
 * 3. As you see there is a possibility to use some kind of boost in Lexus, extract it to a new interface and add that behaviour in one more car.
 * 3. Create one instance of an each car and add them to list.
 * 4. Iterate over the list 10 times, in the 3rd iteration use speed boost on the car if they have one.
 * 5. Print out the car name and speed of the fastest car
 */
public class DragRace {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Audi());
        cars.add(new Bmw());
        cars.add(new Honda());
        cars.add(new Lexus());
        cars.add(new Mazda());
        cars.add(new Tesla());

        for (int i = 0; i < 10; i++) {
            for (Car car : cars) {
                car.speedUp();
                if (i == 3) {
                    car.useNitrousOxideEngine();
                }
            }
        }

        Car fastestCar = cars.stream().max(Comparator.comparing(Car::getCurrentSpeed)).orElseThrow(NoSuchElementException::new);
        System.out.println("Fastest car is " + fastestCar.getName() + " with speed " + fastestCar.getCurrentSpeed());
    }
}
