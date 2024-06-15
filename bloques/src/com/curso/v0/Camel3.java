package com.curso.v0;

// 1. STATIC  (UNA SOLA VEZ, PORQUE SON DE CLASE)
// 2. INSTANCIA
// 3. CONSTRUCTOR

public class Camel3 {
	
	{
		System.out.println("PASO1");
	}
	
	Camel3(){ //CONSTRUCTOR
		System.out.println("PASO CONSTRUCTOR");
	}
	
	int i1 = 8;
	
	{
		System.out.println("PASO3");
	}
	
	static String s1 = "CADENA1";
	
	static {
		System.out.println("PASO STATIC 1");
	}
	
	public static void main(String[] args) {
		Camel3 c2 = new Camel3();
		System.out.println("*** HELLO");
		Camel3 c1 = new Camel3();
		
	}

	static {
		System.out.println("PASO STATIC 2");
	}
	
	{
		System.out.println("PASO2");
	}
}
