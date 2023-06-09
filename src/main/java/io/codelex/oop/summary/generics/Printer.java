package io.codelex.oop.summary.generics;

public class Printer<E> {

    //Fix this class so that any object, not only BigDecimal can be printed
    //Test the functionality

    private final E thingToPrint;

    public Printer(E thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print() {
        System.out.println(thingToPrint);
    }

    public E getThingToPrint() {
        return thingToPrint;
    }
}
