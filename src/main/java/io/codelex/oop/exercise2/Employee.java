package io.codelex.oop.exercise2;

import java.time.LocalDate;

public class Employee extends Person {

    private String position;
    private int startedWorking;

    public Employee(String firstName, String lastName, String id, String age, String position, int startedWorking) {
        super(firstName, lastName, id, age);
        this.position = position;
        this.startedWorking = startedWorking;
    }

    public int getWorkExperience() {
        return LocalDate.now().getYear() - startedWorking;
    }

    @Override
    public String getInfo() {
        return this.position + " " + getFirstName() + " " + getLastName() + " has been working for " + getWorkExperience() + " years.";
    }
}
