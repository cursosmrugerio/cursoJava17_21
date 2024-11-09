package com.curso.v2;

public class Principal {

	public static void main(String[] args) {
		
		Bici bici = new Bici("modeloZ");
		Contenedor<Bici> con1 = new Contenedor<>(bici);
		System.out.println(con1);
		
		Moto moto = new Moto("motoModX");
		Contenedor<Moto> con2 = new Contenedor<>(moto);
		System.out.println(con2);
		
		Motoneta motoneta = new Motoneta("motonetaModY");
		Contenedor<Motoneta> con3 = new Contenedor<>(motoneta);
		System.out.println(con3);
		
		
		Contenedor<Bici> con4 = new Contenedor<>(new Bici("modeloZZZ"));
		
	}

}
