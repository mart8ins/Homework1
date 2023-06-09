package io.codelex.oop.summary.generics;

import org.junit.jupiter.api.Test;

import javax.swing.text.html.Option;
import java.math.BigDecimal;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class StorageHouseTest {

    @Test
    void getMaybeFirstItemString() {
        String expected = "Hello!";
        StorageHouse storageHouse = new StorageHouse();
        storageHouse.addMoreItems("Hello!");
        storageHouse.addMoreItems(33);
        storageHouse.addMoreItems(new BigDecimal(100));
        Optional<String> result = storageHouse.getMaybeFirstItem();
        assertEquals(expected, result.get());
    }

    @Test
    void getMaybeFirstItemInteger() {
        Integer expected = Integer.valueOf(100);
        StorageHouse storageHouse = new StorageHouse();
        storageHouse.addMoreItems(Integer.valueOf(100));
        storageHouse.addMoreItems("Hello!");
        storageHouse.addMoreItems(new BigDecimal(100));
        Optional<Integer> result = storageHouse.getMaybeFirstItem();
        assertEquals(expected, result.get());
    }
}