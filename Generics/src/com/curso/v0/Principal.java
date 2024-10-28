package com.curso.v0;

public class Principal {

	public static void main(String[] args) {
		
		Bici bici = new Bici("modeloZ");
		ContenedorBici cb = new ContenedorBici(bici);
		
		System.out.println(cb);

	}

}
