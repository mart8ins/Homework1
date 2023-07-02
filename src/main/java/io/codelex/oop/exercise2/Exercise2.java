package io.codelex.oop.exercise2;

public class Exercise2 {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Martins", "Meisters", "1", "36", "Java programmer", 2022);
        System.out.println(employee1.getInfo());

        Customer customer = new Customer("Zigimārs", "Olafsons", "2", "66", "CID1", 1);
        customer.setPurchaseCount(10);
        System.out.println(customer.getInfo());


    }
}
