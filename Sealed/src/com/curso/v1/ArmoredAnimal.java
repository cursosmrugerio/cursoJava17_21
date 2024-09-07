package com.curso.v1;

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
		
//		var d = new Pato(20, null);
//		System.out.println(d);
	}

}

final class Armadillo extends ArmoredAnimal {
	@Override
	public String toString() {
		return "Cute";
	}

	public Armadillo(int size, String name) {
		super(size);
	}
}

//final class Pato extends ArmoredAnimal {
//	@Override
//	public String toString() {
//		return "Ugly";
//	}
//
//	public Pato(int size, String name) {
//		super(size);
//	}
//}
