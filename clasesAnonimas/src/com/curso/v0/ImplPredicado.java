package com.curso.v0;

public class ImplPredicado implements Predicado {

	@Override
	public boolean probar(String cadena) {
		return cadena.contains("v");
	}

}
