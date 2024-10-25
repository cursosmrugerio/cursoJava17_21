package com.curso.v0;

import java.util.function.*;

public class Panda {
    int age;

    public static void main(String[] args) {
        Panda p1 = new Panda();
        p1.age = 4;
        Predicate<Panda> lambda = p -> p.age < 5;
        check(p1, lambda);
    }

    private static void check(Panda panda, Predicate<Panda> pred) {
    	boolean res = pred.test(panda);
        String result = res ? "match" : "not match";
        System.out.print(result);
    }
}
