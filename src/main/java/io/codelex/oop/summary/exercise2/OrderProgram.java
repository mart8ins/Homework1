package io.codelex.oop.summary.exercise2;

import java.time.LocalDate;

public class OrderProgram {
    public static void main(String[] args) {
        FoodItem food = new FoodItem("Paprika", 1.15, LocalDate.of(2023, 6, 17));
        ElectronicsItem electronic = new ElectronicsItem("Blender", 99, 800);
        HouseholdItem household = new HouseholdItem("Chair", 44, "Black");

        ItemPacking itemPacking = new ItemPacking();

        Order order = new Order();
        try {
            order.addItem(food);
            order.addItem(electronic);
            order.addItem(household);
            order.addItem(itemPacking);

            Invoice invoice = new Invoice(order, 1001);
            System.out.println(invoice.printInvoice());

        } catch (BadFoodException e) {
            System.out.println(e.getMessage());
        } catch (WrongOrderException e) {
            System.out.println(e.getMessage());
        }
    }
}
