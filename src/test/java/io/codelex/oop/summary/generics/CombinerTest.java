package io.codelex.oop.summary.generics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CombinerTest {

    @Test
    void combineTwoItemsStrings() {
        String expected = "First item: Hello; Second item: World";
        Combiner combiner = new Combiner("Hello", "World");
        String res = combiner.result();
        assertEquals(expected, res);
    }

    @Test
    void combineTwoItemsIntegers() {
        String expected = "First item: 4; Second item: 4";
        Combiner combiner = new Combiner(4, 4);
        String res = combiner.result();
        assertEquals(expected, res);
    }
}