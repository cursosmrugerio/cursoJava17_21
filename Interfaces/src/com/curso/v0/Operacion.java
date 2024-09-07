package com.curso.v0;

abstract interface Operacion {

	// public final static
	int x = 0;

	// public abstract
	int ejecuta(int x, int y);

	// public java8
	static void operacionStatic(String cadena, int i) {
		System.out.println(cadena + " static");
		opeStaticPrivate(i);
	}

	// public java8
	default void operacionDefault(String cadena, double d) {
		System.out.println(cadena + " default");
		opePrivate(d);
	}
	
	// java9
	static private void opeStaticPrivate(int x) {
		System.out.println("static private "+x);
	}
	
	// java9
	private void opePrivate(double d) {
		System.out.println("private "+d);
	}

}
