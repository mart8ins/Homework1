package io.codelex.polymorphism.practice.exercise6;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Animal> animalsList = new ArrayList<Animal>();
        String input;

        String[][] testData = {
                {"{Cat}{Rose}{1.1}{Latvia}{Persian mile}", "{Meat}{3}"},
                {"{Tiger}{Tigors}{22}{Africa}", "{Vegetable}{5}"},
                {"{Zebra}{Zebrix}{15}{India}", "{Vegetable}{7}"},
                {"{Mouse}{Musix}{1}{ASV}", "{Meat}{2}"},
        };

        while (true) {
            System.out.println("Enter animal data or type \"End\" to quit:");
            input = in.nextLine();
            if (input.equals("End")) break;
            String[] animalData = input.replace("{", "").split("}");

            System.out.println("Enter food data: ");
            String[] foodData = in.nextLine().replace("{", "").split("}");

            String animalType = animalData[0];
            String animalName = animalData[1];
            Double animalWeight = Double.valueOf(animalData[2]);
            String animalRegion = animalData[3];
            String breed = null;
            if (animalData.length == 5) {
                breed = animalData[4];
            }

            String foodType = foodData[0];
            int foodQuantity = Integer.valueOf(foodData[1]);
            Food food = null;
            if (foodType.equals("Meat")) {
                food = new Meat(foodQuantity);
            } else {
                food = new Vegetable(foodQuantity);
            }

            if (animalType.equals("Cat")) {
                Animal cat = new Cat(animalName, animalType, animalWeight, 0, animalRegion, breed);
                cat.makeSound();
                cat.eat(food);
                System.out.println(food);
                animalsList.add(cat);
            }
            if (animalType.equals("Tiger")) {
                Animal tiger = new Tiger(animalName, animalType, animalWeight, 0, animalRegion);
                tiger.makeSound();
                System.out.println(food);
                tiger.eat(food);
                animalsList.add(tiger);
            }
            if (animalType.equals("Zebra")) {
                Animal zebra = new Zebra(animalName, animalType, animalWeight, 0, animalRegion);
                zebra.makeSound();
                System.out.println(food);
                zebra.eat(food);
                animalsList.add(zebra);
            }
            if (animalType.equals("Mouse")) {
                Animal mouse = new Mouse(animalName, animalType, animalWeight, 0, animalRegion);
                mouse.makeSound();
                System.out.println(food);
                mouse.eat(food);
                animalsList.add(mouse);
            }
        }

        System.out.println("All animals feeded.");
        for (Animal animal : animalsList) {
            System.out.print(animal);
        }
    }
}
