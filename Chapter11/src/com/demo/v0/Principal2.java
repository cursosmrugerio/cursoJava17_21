package com.demo.v0;

public class Principal2 {

	public static void main(String[] args) {

		int x = 8;
		int y = 0;

		try {
			int resultado = ejecutaDivision(x, y);
			System.out.println(resultado);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Fin Programa");
	}

	static int ejecutaDivision(int x, int y) throws Exception {
		if ( y == 0)
			throw new Exception("No se puede dividir entre Cero");
		return x / y;
	}

}
