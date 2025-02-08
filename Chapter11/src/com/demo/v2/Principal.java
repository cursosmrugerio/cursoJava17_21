package com.demo.v2;

public class Principal {

	public static void main(String[] args)  {

		int x = 8;
		int y = 0;

		int resultado;
		try {
			resultado = ejecutaDivision(x, y);
			System.out.println(resultado);
		} catch (DividirEntreCeroRuntimeException e) {
			e.printStackTrace();
		}
		System.out.println("Fin Programa");
	}

	static int ejecutaDivision(int x, int y) 
			throws DividirEntreCeroRuntimeException {
		if (y==0)
			throw new DividirEntreCeroRuntimeException("No se puede dividir entre Cero");
		return x / y;
	}

}
