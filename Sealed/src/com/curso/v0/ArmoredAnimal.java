package com.curso.v0;

public class ArmoredAnimal {

	public ArmoredAnimal(int size) {
	}

	@Override
	public String toString() {
		return "Strong";
	}

	public static void main(String[] a) {
		var c = new Armadillo(10, null);
		System.out.println(c);
		
		var d = new Pato(20, null);
		System.out.println(d);
	}

}

class Armadillo extends ArmoredAnimal {
	@Override
	public String toString() {
		return "Cute";
	}

	public Armadillo(int size, String name) {
		super(size);
	}
}

class Pato extends ArmoredAnimal {
	@Override
	public String toString() {
		return "Ugly";
	}

	public Pato(int size, String name) {
		super(size);
	}
}
