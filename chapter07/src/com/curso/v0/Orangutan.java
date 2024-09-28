package com.curso.v0;

class Primate {
    protected int age = 2;

    {
        age = 1;
    }

    public Primate() {
        this.age = 3;
    }
}

public class Orangutan extends Primate {
    protected int age = 4;

    {
        age = 5;
    }

    public Orangutan() {
        this.age = 6;
    }

    public static void main(String[] bananas) {
        final Primate x = new Orangutan();
        System.out.println(x.age); //
    }
}
