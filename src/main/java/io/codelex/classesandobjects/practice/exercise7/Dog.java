package io.codelex.classesandobjects.practice.exercise7;

public class Dog {
    private String name;
    private String sex;

    private String mother;
    private String father;


    public Dog(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public String getFathersName() {
        if (father != null) {
            return father;
        } else {
            return "Unknown";
        }
    }

    public boolean hasSameMotherAs(Dog dog) {
        return this.mother == dog.mother;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
