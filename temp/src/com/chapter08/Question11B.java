package com.chapter08;

import java.util.function.Predicate;

public class Question11B {

	public static void main(String[] args) {
		scary("dragon");
	}

	public static void scary(String animal) {
		Predicate<String> dino = s -> {
			System.out.println("1: "+s);
			return "dino".equals(animal);
		};
		Predicate<String> dragon = s -> {
			System.out.println("2: "+s);
			return "dragon".equals(animal);
		};
		Predicate<String> combined = dino.or(dragon);
		
		System.out.println(combined.test(animal));
	}

}
