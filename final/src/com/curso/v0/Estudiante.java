package com.curso.v0;

import java.util.Objects;

public class Estudiante{
	
	//HAS-A (TIENE UN)
	//Estudiante e;
	String nombre;
	int edad;
	
	public Estudiante(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	@Override
	public boolean equals(Object obj) {
		Estudiante other = (Estudiante) obj;
		return edad == other.edad && Objects.equals(nombre, other.nombre);
	}
	
	final void aplicarTest(){
		System.out.println("Aplicar prueba");
	}
	
	final static void staticAplicarTest() {
		System.out.println("Static Aplicar prueba");
	}
	
}
