package com.curso;

//QUESTION 11
class Zoo {

	public static void main(String[] args) {
		new Zoo().printLocation(Animal.MAMMAL);
	}

	enum Animal {
		BIRD, FISH, MAMMAL, OTHER
	}

	void printLocation(Animal a) {
		long type = switch (a) {
		case BIRD -> 1;
		case FISH -> 2;
		case MAMMAL -> 3;
		default -> 4;
		};
		System.out.print(type);
	}
}
