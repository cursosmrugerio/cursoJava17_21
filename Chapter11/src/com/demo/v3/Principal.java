package com.demo.v3;

public class Principal {

	public static void main(String[] args)  {

		int x = 8;
		int y = 2;

		int resultado;
		try {
			resultado = ejecutaDivision(x, y);
			System.out.println(resultado);
		} catch (DividirEntreCeroRuntimeException e) {
			e.printStackTrace();
		} catch (NoNegativosDivision e) {
			e.printStackTrace();
		}
		System.out.println("Fin Programa");
	}

	static int ejecutaDivision(int x, int y) 
			throws DividirEntreCeroRuntimeException, NoNegativosDivision {
		
		if (y==0)
			throw new DividirEntreCeroRuntimeException("No se puede dividir entre Cero");
		if (y<0)
			throw new NoNegativosDivision("No se puede dividir entre negativos ");
		return x / y;
	}

}
