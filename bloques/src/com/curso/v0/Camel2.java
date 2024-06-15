package com.curso.v0;

// 1. BLOQUES ANONIMOS STATIC (UNA SOLA VEZ, PORQUE SON DE CLASE)
// 2. BLOQUES ANONIMOS INSTANCIA
// 3. CONSTRUCTOR

public class Camel2 {
	
	{
		System.out.println("PASO1");
	}
	
	Camel2(){ //CONSTRUCTOR
		System.out.println("PASO CONSTRUCTOR");
	}
	
	{
		System.out.println("PASO3");
	}
	
	static {
		System.out.println("PASO STATIC 1");
	}
	
	public static void main(String[] args) {
		Camel2 c2 = new Camel2();
		System.out.println("*** HELLO");
		Camel2 c1 = new Camel2();
		
	}

	static {
		System.out.println("PASO STATIC 2");
	}
	
	{
		System.out.println("PASO2");
	}
	//PASO1 PASO2 PASOCONSTRUCTOR HELLO
}
