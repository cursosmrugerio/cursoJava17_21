package com.demo.v1;

public class Principal {

	public static void main(String[] args) {

		int x = 8;
		int y = 0;

		int resultado = ejecutaDivision(x, y);
		System.out.println(resultado);

		System.out.println("Fin Programa");
	}

	static int ejecutaDivision(int x, int y) {
		if (y==0)
			throw new DividirEntreCeroRuntimeException("No se puede divier entre Cero");
		return x / y;
	}

}
