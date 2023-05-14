package io.codelex.classesandobjects.practice.exercise1;

public class Exercise1 {
    public static void main(String[] args) {
        Product product1 = new Product("Logitech mouse", 70.00, 14);
        Product product2 = new Product("iPhone 5s", 999.99, 3);
        Product product3 = new Product("Epson EB-U05", 440.46, 1);

        product1.printProduct();
        product2.printProduct();
        product3.printProduct();

        product1.setAmountAtStart(20);
        product1.setPriceAtStart(49.99);
        product2.setAmountAtStart(1);
        product2.setPriceAtStart(1499.00);
        product3.setAmountAtStart(2);
        product3.setPriceAtStart(1699.00);

        System.out.println();
        product1.printProduct();
        product2.printProduct();
        product3.printProduct();

    }
}
