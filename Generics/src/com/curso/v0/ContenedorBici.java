package com.curso.v0;

public class ContenedorBici {
	
	private Bici bici;

	public ContenedorBici(Bici bici) {
		this.bici = bici;
	}

	@Override
	public String toString() {
		return "ContenedorBici [bici=" + bici + "]";
	}

	
}
