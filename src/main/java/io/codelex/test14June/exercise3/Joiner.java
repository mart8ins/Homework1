package io.codelex.test14June.exercise3;

import java.util.ArrayList;
import java.util.List;

public class Joiner<T> {

    private List<T> box = new ArrayList<>();
    private String seperator;

    public Joiner(String seperator) {
        this.seperator = seperator;
    }

    public void addItem(T element) {
        box.add(element);
    }

    public String join() {
        String res = "";
        for (T inte : box) {
            res += inte.toString() + seperator;
        }
        String wOutLast = res.substring(0, res.length() - 1);

        return wOutLast;
    }
}
