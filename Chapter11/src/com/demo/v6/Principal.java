package com.demo.v6;

public class Principal {

	public static void main(String[] args) {

		int x = 1008;
		int y = 2;

		int resultado;
		try {
			resultado = ejecutaDivision(x, y);
			System.out.println(resultado);
		}finally {
			System.out.println("Paso por Finally");
		}
		System.out.println("Fin Programa");
	}

	static int ejecutaDivision(int x, int y)  {
		if (x >= 1000)
			throw new UnsupportedOperationException("x no puede ser mayor o igual a mil");
		return x / y;
	}

}
