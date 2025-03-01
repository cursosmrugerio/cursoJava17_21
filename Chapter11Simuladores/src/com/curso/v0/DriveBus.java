package com.curso.v0;

public class DriveBus {
    public void go() {
        System.out.println("A");
        try {
            stop();
        } catch (ArithmeticException e) {
            System.out.print("B");
        } finally {
            System.out.println("C");
        }
        System.out.print("D");
    }

    public void stop() {
        System.out.println("E");
        Object x = null;
        x.toString();
        System.out.print("F");
    }

    public static void main(String n[]) {
        new DriveBus().go();
    }
}
