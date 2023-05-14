package io.codelex.classesandobjects.practice.exercise7;

public class DogTest {
    public static void main(String[] args) {
        Dog max = new Dog("Max", "male");
        Dog rocky = new Dog("Rocky", "male");
        Dog sparkly = new Dog("Sparkly", "male");
        Dog buster = new Dog("Buster", "male");
        Dog sam = new Dog("Sam", "male");
        Dog lady = new Dog("Lady", "female");
        Dog molly = new Dog("Molly", "female");
        Dog coco = new Dog("Coco", "female");

        max.setMother("Lady");
        max.setFather("Rocky");

        coco.setMother("Molly");
        coco.setFather("Buster");

        rocky.setMother("Molly");
        rocky.setFather("Sam");

        buster.setMother("Lady");
        buster.setFather("Sparkly");

        System.out.println(coco.getFathersName());
        System.out.println(sparkly.getFathersName());

        System.out.println(coco.hasSameMotherAs(rocky));


    }
}
