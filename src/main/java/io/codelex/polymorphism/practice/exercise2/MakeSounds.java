package io.codelex.polymorphism.practice.exercise2;

import java.util.ArrayList;
import java.util.List;

public class MakeSounds {
    public static void main(String[] arg) {
        List<Sound> list = new ArrayList<>();
        list.add(new Firework());
        list.add(new Parrot());
        list.add(new Radio());

        for (Sound sound : list) {
            sound.playSound();
        }
    }
}
