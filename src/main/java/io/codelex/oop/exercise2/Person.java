package io.codelex.oop.exercise2;

public abstract class Person {
    private String firstName;
    private String lastName;

    private String id;

    private String age;

    public Person(String firstName, String lastName, String id, String age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getId() {
        return id;
    }

    public String getAge() {
        return age;
    }

    public abstract String getInfo();
}
