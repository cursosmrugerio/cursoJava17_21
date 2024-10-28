package com.curso.v6;

public class Motoneta implements Transporte {
	
	private String modelo;

	public Motoneta(String modelo) {
		this.modelo = modelo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Motoneta [modelo=" + modelo + "]";
	}
	
	

}
