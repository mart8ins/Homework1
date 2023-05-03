package io.codelex.multithreading.practice;

import io.codelex.NoCodeWrittenException;
import org.apache.commons.lang3.RandomUtils;

/**
 * https://en.wikipedia.org/wiki/Dining_philosophers_problem
 */
public class DiningPhilosophersProblem {

    public static void main(String[] args) {
        Philosopher[] philosophers = new Philosopher[5];
        Object[] forks = new Object[philosophers.length];

        for (int i = 0; i < forks.length; i++) {
            forks[i] = new Object();
        }

        for (int i = 0; i < philosophers.length; i++) {
            final String name = "Philosopher " + (i + 1);
            Object leftFork = forks[i];
            Object rightFork = forks[(i + 1) % forks.length];

            if (i == philosophers.length - 1) {
                philosophers[i] = new Philosopher(rightFork, leftFork); // The last philosopher picks up the right fork first
            } else {
                philosophers[i] = new Philosopher(leftFork, rightFork);
            }

            //run each philosopher in his own thread specifying his name as thread name
            throw new NoCodeWrittenException();
        }
    }

    static class Philosopher {
        private final Object leftFork;
        private final Object rightFork;

        Philosopher(Object left, Object right) {
            this.leftFork = left;
            this.rightFork = right;
        }

        private void doAction(String action) throws InterruptedException {
            System.out.println(Thread.currentThread().getName() + " " + action);
            Thread.sleep(RandomUtils.nextLong(0, 100));
        }

        void eat() {
            try {
                while (true) {
                    doAction(System.nanoTime() + ": Thinking");
                    doAction(System.nanoTime() + ": Picked up left fork");
                    doAction(System.nanoTime() + ": Picked up right fork - eating");
                    doAction(System.nanoTime() + ": Put down right fork");
                    doAction(System.nanoTime() + ": Put down left fork. Returning to thinking");
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
