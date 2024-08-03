package com.curso.v0;

public class EstudianteExt extends Estudiante {

	public EstudianteExt(String nombre, int edad) {
		super(nombre, edad);
	}
	
	void aplicarOtroTest(){
		
		final var cadena = "Hello";
		final var i = 6;
		
		super.aplicarTest();
	}
	
//	@Override
//	void aplicarTest(){
//		System.out.println("Aplicar prueba");
//	}

//	//HIDDEN
//	static void staticAplicarTest() {
//		System.out.println("Static Aplicar prueba");
//	}
	
}
