package com.linkedin.generics;

public class TestGenericHierarchies {
    public static void main(String[] args) {
        CardboardBox<Fruit> cardboardBox = new CardboardBox<>();

        Box<Fruit> fruitBox = new Box<>();

        fruitBox = cardboardBox;
    }
}
