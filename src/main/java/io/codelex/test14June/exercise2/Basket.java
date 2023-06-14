package io.codelex.test14June.exercise2;

import java.util.*;

public class Basket<E> {

    private List<E> basket = new ArrayList<>();
    private int count = 0;

    public Basket() {
    }

    public void addToBasket(E element) {
        try {
            if (count == 10) {
                throw new BasketFullException("Basket is full.");
            }
            basket.add(element);
            count++;

        } catch (BasketFullException e) {
            System.out.println(e.getMessage());
        }

    }

    public void removeFromBasket(E element) {
        try {
            if (count == 0) {
                throw new BasketEmptyException("Basket is already empty. Nothing to remove.");
            }
            basket.remove(element);
            count--;

        } catch (BasketFullException e) {
            System.out.println(e.getMessage());
        }
    }

    public List<E> getBasket() {
        return basket;
    }

    public int getCount() {
        return count;
    }
}
