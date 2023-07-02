package io.codelex.exceptions.practice;

public class Exercise2 {
    public void methodA() throws ArithmeticException {

        try {
            methodB();
        } catch (ArithmeticException e) {
            new Throwable().printStackTrace();
        }
    }

    public void methodB() throws ArithmeticException {
        try {
            methodC();
        } catch (ArithmeticException e) {
            new Throwable().printStackTrace();
            throw new ArithmeticException("Illegal divide by zero.");
        }
    }

    public void methodC() throws ArithmeticException {
        try {
            System.out.println(2 / 0);
        } catch (ArithmeticException e) {
            new Throwable().printStackTrace();
            throw new ArithmeticException("Illegal divide by zero.");
        }
    }
}
