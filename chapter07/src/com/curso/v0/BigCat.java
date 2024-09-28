package com.curso.v0;

public interface BigCat {

	abstract String getName();

	static int hunt() {
		// getName();
		return 5;
	}

	default void climb() {
		rest();
		hunt();
	}

	private int rest() {
		return 2;
	};

	private void roar() {
		getName();
		climb();
		hunt();
	}

	private static boolean sneak() {
		//roar();
		return true;
	}
}
