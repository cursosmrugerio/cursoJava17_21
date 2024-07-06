package com.curso;

public class Question04 {

	public static void main(String[] args) {
		new Question04().printReptile(6);
	}

	void printReptile(int category) {
		var type = switch (category) {
		case 1, 2 -> "Snake";
		case 3, 4 -> "Lizard";
		case 5, 6 -> { yield "Turtle"; }
		case 7, 8 -> "Alligator";
		default -> "None";
		};
		System.out.print("Res: "+type);

	}
}
