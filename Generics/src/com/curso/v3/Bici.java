package com.curso.v3;

public class Bici {
	
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
