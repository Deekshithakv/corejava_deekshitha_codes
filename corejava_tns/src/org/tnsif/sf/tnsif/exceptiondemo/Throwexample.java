package org.tnsif.sf.tnsif.exceptiondemo;

public class Throwexample {
    public static void main(String[] args) {
        int age = 25;

        try {
            if (age > 18) {
                throw new ArithmeticException("You are eligible");
            } else {
                System.out.println("Not eligible");
            }
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
