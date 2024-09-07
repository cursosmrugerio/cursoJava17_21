package com.curso.v0;

public class Principal {

	public static void main(String[] args) {

		Operacion ope1 = new Suma();
		
		int res = ope1.ejecuta(8, 4);
		
		System.out.println(res);
		
		//Operacion.operacionStatic("HelloWorld",100);
		
		ope1.operacionDefault("HelloWorld",20.0);
		
		
		
	}

}
