package com.demo.v0;

public class Principal {

	public static void main(String[] args) {

		int x = 8;
		int y = 0;
		try {
			int resultado = ejecutaDivision(x, y);
			System.out.println(resultado);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}

		System.out.println("Fin Programa");
	}

	static int ejecutaDivision(int x, int y) {
		return x / y;
	}

}
