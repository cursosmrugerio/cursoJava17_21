package com.book.v0;

public class Frog {

	public static void main(String[] args) {
		//new Frog().hop(null, 1);
		new Frog().hop("Kermit", null);
	}

	public void hop(String name, Integer jump) {
		System.out.print(name.toLowerCase() + " " + jump.intValue());
	}

}
