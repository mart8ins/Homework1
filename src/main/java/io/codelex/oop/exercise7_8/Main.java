package io.codelex.oop.exercise7_8;

public class Main {
    public static void main(String[] args) {
        Computer laptop = new Laptop("i1", "2gb", "Nvidia", "Acer", "SK1", "10 Mah");
        Laptop laptop1 = new Laptop("i6", "16gb", "Force", "Toshiba", "MM2", "20 Mah");

        System.out.println(laptop.getGraphicsCard());
        System.out.println(laptop1.getCompany());
    }
}
