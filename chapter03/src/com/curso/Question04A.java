package com.curso;

public class Question04A {

	public static void main(String[] args) {
		String res = new Question04A().printReptile(8);
		System.out.println(res);
	}

	String printReptile(int category) {
		return switch (category) {
		case 1, 2 -> "Snake";
		case 3, 4 -> "Lizard";
		case 5, 6 -> { yield "Turtle"; }
		case 7, 8 -> "Alligator";
		default -> "None";
		};
	}
}
