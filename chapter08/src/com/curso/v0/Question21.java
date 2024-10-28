package com.curso.v0;

@FunctionalInterface
interface Transport {
	public int go(); // <== Abstract

	public boolean equals(Object o);
}

@FunctionalInterface
interface Train extends Transport {
}

//@FunctionalInterface
interface Locomotive extends Train {
	int getSpeed();
}

@FunctionalInterface
interface Spaceship extends Transport {
	default int blastOff() {
		return 0;
	};
}

@FunctionalInterface
abstract interface Boat {
	int hashCode(); //<== Object
	public abstract int hashCode(String input); // <== Abstract
}

public class Question21 {

	public static void main(String[] args) {
		System.out.println("Hello");
	}

}
