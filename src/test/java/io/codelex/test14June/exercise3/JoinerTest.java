package io.codelex.test14June.exercise3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JoinerTest {

    @Test
    @DisplayName("Test for Integers with seperator -")
    void join1() {
        Joiner<Integer> integers = new Joiner<>("-");
        integers.addItem(Integer.valueOf(1));
        integers.addItem(Integer.valueOf(2));
        integers.addItem(Integer.valueOf(3));
        String result = integers.join();

        assertEquals("1-2-3", result);
    }

    @Test
    @DisplayName("Test for Strings with seperator :")
    void join2() {
        Joiner<String> integers = new Joiner<>(":");
        integers.addItem("first");
        integers.addItem("second");
        integers.addItem("third");
        String result = integers.join();

        assertEquals("first:second:third", result);
    }
}