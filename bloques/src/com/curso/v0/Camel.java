package com.curso.v0;

// 1. BLOQUES ANONIMOS INSTANCIA
// 2. CONSTRUCTOR

public class Camel {
	
	{
		System.out.println("PASO1");
	}
	
	Camel(){
		System.out.println("PASO CONSTRUCTOR");
	}
	
	{
		System.out.println("PASO3");
	}
	
	public static void main(String[] args) {
		Camel c2 = new Camel();
		System.out.println("*** HELLO");
		Camel c1 = new Camel();
		
	}

	{
		System.out.println("PASO2");
	}
	//PASO1 PASO2 PASOCONSTRUCTOR HELLO
}
