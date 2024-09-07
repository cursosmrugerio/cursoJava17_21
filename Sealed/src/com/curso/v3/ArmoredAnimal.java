package com.curso.v3;

public sealed class ArmoredAnimal permits Armadillo{

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

 sealed class Armadillo extends ArmoredAnimal permits Pato {
	@Override
	public String toString() {
		return "Cute";
	}

	public Armadillo(int size, String name) {
		super(size);
	}
}

non-sealed class Pato extends Armadillo {
	@Override
	public String toString() {
		return "Ugly";
	}

	public Pato(int size, String name) {
		super(size,name);
	}
}
