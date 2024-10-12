package com.chapter08;

import java.util.function.Predicate;

public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void scary(String animal) {
		Predicate<String> dino = s -> "dino".equals(animal);
		Predicate<String> dragon = s -> "dragon".equals(animal);
		Predicate<String> combined = dino.or(dragon);
		System.out.println(combined.test(animal));
	}

}
