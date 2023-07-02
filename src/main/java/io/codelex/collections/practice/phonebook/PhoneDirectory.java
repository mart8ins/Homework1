package io.codelex.collections.practice.phonebook;

import java.util.Map;
import java.util.TreeMap;

public class PhoneDirectory {
    private Map<Integer, PhoneEntry> data;
    private int dataCount;

    public PhoneDirectory() {
        data = new TreeMap<Integer, PhoneEntry>();
        dataCount = 0;
    }

    private int find(String name) {
        for (int i = 0; i < dataCount; i++) {
            if (data.get(i).equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public PhoneEntry getNumber(String name) {
        int position = find(name);
        if (position == -1) {
            return null;
        } else {
            return data.get(position);
        }
    }

    public void putNumber(String name, String number) {
        if (name == null || number == null) {
            throw new IllegalArgumentException("name and number cannot be null");
        }
        int i = find(name);
        if (i >= 0) {
            data.get(i).number = number; // OK
        } else {
            dataCount++;
            PhoneEntry newEntry = new PhoneEntry("Martins", "29141645");  // Create a new pair.
            data.put(dataCount, newEntry);
        }
    }
}
