package com.linkedin.generics;

import java.util.Collections;

public class TestTypeInference {
    public static void main(String[] args) {
        //type witness demo
        var list = Collections.<String>emptyList();

        //type inference demo
        Number number = pickOne(12, 23.78);

        Fruit fruit = new Fruit("Mango", "India", "Yellow", 0.5);
        Apple apple = new Apple("Royal Gala", "Sweden", "Green", 0.3);
        Boxable  pickedFruit = pickOne(fruit, apple);

        //type inference with instantiation
        Box<Fruit> fruitBox = new Box<>();

        //type inference with method arguments
        var box = Box.of(fruit);
        var anotherBox = Box.of(apple);

        //type inference with target types
       Box<Fruit> fruitBox1 = BoxUtils.emptyBox();
       Box<Apple> appleBox = BoxUtils.emptyBox();
    }

    public static <T> T pickOne(T t1, T t2){
        if(Math.random()>0.5){
            return t1;
        }
        else return t2;
    }
}
