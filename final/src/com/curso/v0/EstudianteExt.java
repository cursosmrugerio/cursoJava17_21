package com.curso.v0;

public class EstudianteExt extends Estudiante {

	public EstudianteExt(String nombre, int edad) {
		super(nombre, edad);
	}
	
	void aplicarOtroTest(){
		super.aplicarTest();
	}

}
