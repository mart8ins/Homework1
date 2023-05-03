package io.codelex.multithreading.practice;

import io.codelex.NoCodeWrittenException;
import org.apache.commons.lang3.RandomUtils;

public class CounterExercise {

    public static void main(String[] args) {
        final Counter counter = new Counter();

        for (int i = 0; i < 1000; i++) {
            throw new NoCodeWrittenException();
        }

        System.out.println("Final count is : " + counter.getCount());
    }

    static class Counter {
        int count = 0;

        public void increment() {
            try {
                Thread.sleep(RandomUtils.nextLong(0, 100));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            count = count + 1;
        }

        public int getCount() {
            return count;
        }
    }
}
