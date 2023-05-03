package io.codelex.multithreading.practice;

/**
 * Think what would be the output of the program before actually running it.
 * Explain the behaviour.
 */
public class MemoryConsistencyExercise {
    private static boolean sayHello = false;

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            while (!sayHello) {
            }

            System.out.println("Hello World!");

            while (sayHello) {
            }

            System.out.println("Good Bye!");
        });

        thread.start();

        Thread.sleep(1000);
        System.out.println("Say Hello..");
        sayHello = true;

        Thread.sleep(1000);
        System.out.println("Say Bye..");
        sayHello = false;
    }
}
