package io.codelex.classesandobjects.practice.exercise3;

public class FuelGauge {
    private int FUEL_CAPACITY = 70;
    private int currentAmount;

    public void fillUpTank() {
        if (currentAmount < 70) {
            currentAmount++;
        }
    }

    public void burnTank() {
        if (currentAmount > 0) {
            currentAmount--;
        }
    }

    public String getReport() {
        return "You car`s current amount of fuel is " + currentAmount + " liters.";
    }

    public int getCurrentAmount() {
        return currentAmount;
    }

    public int getMaxCapacity() {
        return FUEL_CAPACITY;
    }
}
