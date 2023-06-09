package io.codelex.oop.summary.exercise1;


import java.util.function.Supplier;

public class LazyBox<E> implements Supplier {
    E value;
    Supplier box;

    public LazyBox(Supplier box) {
        this.box = box;
    }

    @Override
    public E get() {
        if (value == null) {
            value = (E) box.get();
            return value;
        } else {
            return value;
        }
    }
}
