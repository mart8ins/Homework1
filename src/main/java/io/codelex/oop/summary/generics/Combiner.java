package io.codelex.oop.summary.generics;

public class Combiner<E, S> {

    private E first;
    private S second;

    public Combiner(E first, S second) {
        this.first = first;
        this.second = second;
    }

    public E getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    //Fix this method so it can receive two any kind of objects
    //Test the functionality

    public String combineTwoItems(E first, S second) {
        return "First item: " + first.toString() + "; Second item: " + second.toString();
    }
}
