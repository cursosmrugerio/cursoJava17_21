package com.curso.v1;

public class Contenedor {
	
	private Bici bici;
	private Moto moto;
	private Motoneta motoneta;
	
	Contenedor(Bici bici){
		this.bici = bici;
	}
	
	Contenedor(Moto moto){
		this.moto = moto;
	}
	
	Contenedor(Motoneta motoneta){
		this.motoneta = motoneta;
	}

	@Override
	public String toString() {
		return "Contenedor [bici=" + bici + ", moto=" + moto + ", motoneta=" + motoneta + "]";
	}
	
	

}
