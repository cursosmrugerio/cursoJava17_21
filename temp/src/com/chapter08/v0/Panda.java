package com.chapter08.v0;

import java.util.function.*;

public class Panda {
    int age;
    
    public static void main(String[] args) {
        Panda p1 = new Panda();
        p1.age = 1;
        check(p1, p -> {return p.age < 5;});
    }

    private static void check(Panda panda, Predicate<Panda> pred) {
        String result = pred.test(panda)
            ? "match" : "not match";
        System.out.print(result);
    }
}
