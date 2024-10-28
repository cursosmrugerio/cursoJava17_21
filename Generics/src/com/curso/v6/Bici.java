package com.curso.v6;

public class Bici implements Transporte {
	
	private String modelo;

	public Bici(String modelo) {
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
		return "Bici [modelo=" + modelo + "]";
	}
	
}
