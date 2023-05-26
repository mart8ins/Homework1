package io.codelex.oop.exercise6;

public class Parcel implements Validatable {
    private int xLength;
    private int yLength;
    private int zLength;
    private float weight;
    private boolean isExpress;

    public Parcel(int xLength, int yLength, int zLength, float weight) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
    }

    @Override
    public boolean validate() {
        boolean dimensionsSumOk = this.xLength + this.yLength + this.zLength <= 300 ? true : false;
        boolean expressOk = this.weight <= 30 ? true : false;
        boolean dimensionsOk = this.xLength >= 30 && this.yLength >= 30 && this.zLength >= 30 ? true : false;

        if (dimensionsSumOk && expressOk && dimensionsOk) {
            return true;
        } else {
            if (!dimensionsSumOk) {
                System.out.println("Dimensions for this parcel is to big. Can`t exceed 300.");
            }
            if (expressOk) {
                this.isExpress = true;
            } else {
                System.out.println("The weight of parcel is to big, it does not fit in Express deliveries. Weight must be below 30.");
            }
            if (!dimensionsOk) {
                System.out.println("Some of dimensions for parcel is to small.");
            }
        }
        return false;
    }
}
