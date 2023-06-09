package io.codelex.oop.summary.generics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrinterTest {

    @Test
    void getThingToPrintString() {
        String expected = "Hello!";
        Printer printer = new Printer<>("Hello!");
        String result = printer.getThingToPrint().toString();
        assertEquals(expected, result);
    }

    @Test
    void getThingToPrintInteger() {
        Integer expected = Integer.valueOf(50);
        Printer printer = new Printer<>(Integer.valueOf(50));
        Integer result = (Integer) printer.getThingToPrint();
        assertEquals(expected, result);
    }
}