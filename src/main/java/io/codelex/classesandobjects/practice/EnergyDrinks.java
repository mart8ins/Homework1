package io.codelex.classesandobjects.practice;

public class EnergyDrinks {
    private static final int NUMBERED_SURVEYED = 12467;
    private static final double PURCHASED_ENERGY_DRINKS = 0.14;
    private static final double PREFER_CITRUS_DRINKS = 0.64;

    private static int energyDrinkers;
    private static int preferCitrus;

    public static void main(String[] args) {
        //fixme
        System.out.println("Total number of people surveyed " + NUMBERED_SURVEYED);
        System.out.println("Approximately " + energyDrinkers + " bought at least one energy drink");
        System.out.println(preferCitrus + " of those " + "prefer citrus flavored energy drinks.");
    }

    public static double calculateEnergyDrinkers(int numberSurveyed) {
        return numberSurveyed * PURCHASED_ENERGY_DRINKS;
    }

    public static double calculatePreferCitrus(int numberSurveyed) {
        return calculateEnergyDrinkers(NUMBERED_SURVEYED) * PREFER_CITRUS_DRINKS;
    }


}
