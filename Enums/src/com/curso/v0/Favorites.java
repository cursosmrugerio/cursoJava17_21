package com.curso.v0;

public class Favorites {

	enum Flavors {
		VANILLA, CHOCOLATE, STRAWBERRY;
		
		static final Flavors DEFAULT = STRAWBERRY;
	}

	public static void main(String[] args) {
		
		System.out.println(Flavors.DEFAULT);

		for (final var e : Flavors.values())
			System.out.println(e+": "+e.ordinal());

		Flavors[] array = Flavors.values();
		for (final Flavors f : array)
			System.out.println(f);

	}

}
