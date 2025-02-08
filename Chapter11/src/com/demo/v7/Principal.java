package com.demo.v7;

public class Principal {

	public static void main(String[] args) {

		int x = 8;
		int y = 0;

		int resultado;
		try {
			resultado = ejecutaDivision(x, y);
			System.out.println(resultado);
		} catch (DividirEntreCeroRuntimeException | NoNegativosDivision | UnsupportedOperationException  e) {
			e.printStackTrace();
		} catch (RuntimeException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Paso por Finally");
		}
		System.out.println("Fin Programa");
	}

	static int ejecutaDivision(int x, int y) throws DividirEntreCeroRuntimeException, NoNegativosDivision {

		if (y == 0)
			throw new DividirEntreCeroRuntimeException("No se puede dividir entre Cero");
		if (y < 0)
			throw new NoNegativosDivision("No se puede dividir entre negativos ");
		if (x >= 1000)
			throw new UnsupportedOperationException("x no puede ser mayor o igual a mil");
		return x / y;
	}

}
