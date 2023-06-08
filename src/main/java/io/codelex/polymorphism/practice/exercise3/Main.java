package io.codelex.polymorphism.practice.exercise3;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Martins", "Meisters", "Riga", 10, 9.5);
        Employee employee = new Employee("Martins", "Meisters", "Riga", 10, "coder");

        student.display();
        employee.display();
    }
}
