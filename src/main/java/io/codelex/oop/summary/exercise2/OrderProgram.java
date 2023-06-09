package io.codelex.oop.summary.exercise2;

import java.time.LocalDate;

public class OrderProgram {
    public static void main(String[] args) {
        Item food = new FoodItem("Paprika", 1.15, LocalDate.of(2023, 6, 15));
        Item electronic = new ElectronicsItem("Blender", 99, 800);
        Item household = new HouseholdItem("Chair", 44, "Black");

        Order order = new Order();
        order.addItem(food);
        order.addItem(electronic);
        order.addItem(household);

        Invoice invoice = new Invoice(order, 1001);
        System.out.println(invoice.printInvoice());
    }
}
