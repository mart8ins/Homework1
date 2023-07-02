package io.codelex.oop.exercise6;

public class Main {
    public static void main(String[] args) {
        Parcel parcel = new Parcel(211, 45, 116, 54);
        Parcel parcel1 = new Parcel(35, 45, 12, 13);

        System.out.println("******** Parcel 1 **********");
        parcel.validate();
        System.out.println("******** Parcel 2 **********");
        parcel1.validate();

    }
}
