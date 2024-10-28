package com.curso.v5;

public class Motoneta {
	
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
