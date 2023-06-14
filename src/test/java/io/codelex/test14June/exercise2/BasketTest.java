package io.codelex.test14June.exercise2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasketTest {

    @Test
    @DisplayName("4 apples added Basket size should be 4")
    void addToBasket1() {
        Basket<Apple> basket = new Basket();
        basket.addToBasket(new Apple());
        basket.addToBasket(new Apple());
        basket.addToBasket(new Apple());
        basket.addToBasket(new Apple());
        int count = basket.getCount();
        assertEquals(4, count);
    }

    @Test
    @DisplayName("11 Apples added, but count should be 10")
    void addToBasket2() {
        Basket basket = new Basket();
        for (int i = 0; i <= 12; i++) {
            basket.addToBasket(new Apple());
        }
        int count = basket.getCount();
        assertEquals(10, count);
    }

    @Test
    @DisplayName("4 mushrooms added, one removed. Count should be 3")
    void removeFromBasket1() {
        Basket<Mushroom> basket = new Basket();
        Mushroom a = new Mushroom();
        Mushroom b = new Mushroom();
        Mushroom c = new Mushroom();
        Mushroom d = new Mushroom();
        basket.addToBasket(a);
        basket.addToBasket(b);
        basket.addToBasket(c);
        basket.addToBasket(d);
        basket.removeFromBasket(b);
        int count = basket.getCount();
        assertEquals(3, count);
    }

    @Test
    @DisplayName("2 mushrooms added, trying to remove 3, count should be 0 and displays error message.")
    void removeFromBasket2() {
        Basket<Mushroom> basket = new Basket();
        Mushroom a = new Mushroom();
        Mushroom b = new Mushroom();

        basket.addToBasket(a);
        basket.addToBasket(b);
        basket.removeFromBasket(a);
        basket.removeFromBasket(b);
        basket.removeFromBasket(a);
        
        int count = basket.getCount();
        assertEquals(0, count);
    }
}