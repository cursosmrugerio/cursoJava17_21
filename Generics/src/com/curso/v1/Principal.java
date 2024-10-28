package com.curso.v1;

public class Principal {

	public static void main(String[] args) {
		
		Bici bici = new Bici("modeloZ");
		Contenedor c = new Contenedor(bici);
		
		System.out.println(c);

	}

}
