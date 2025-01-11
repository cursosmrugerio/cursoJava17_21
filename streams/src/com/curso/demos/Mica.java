package com.curso.demos;

public class Mica {

	private String nombrePb;
	private String unidadHor;
	private String unidadVer;
	private long cantidadVendida;
	
	public Mica(String nombrePb, String unidadHor, String unidadVer, long cantidadVendida) {
		this.nombrePb = nombrePb;
		this.unidadHor = unidadHor;
		this.unidadVer = unidadVer;
		this.cantidadVendida = cantidadVendida;
	}

	public String getNombrePb() {
		return nombrePb;
	}

	public void setNombrePb(String nombrePb) {
		this.nombrePb = nombrePb;
	}

	public String getUnidadHor() {
		return unidadHor;
	}

	public void setUnidadHor(String unidadHor) {
		this.unidadHor = unidadHor;
	}

	public String getUnidadVer() {
		return unidadVer;
	}

	public void setUnidadVer(String unidadVer) {
		this.unidadVer = unidadVer;
	}

	public long getCantidadVendida() {
		return cantidadVendida;
	}

	public void setCantidadVendida(long cantidadVendida) {
		this.cantidadVendida = cantidadVendida;
	}
	
	@Override
	public String toString() {
		return "Mica [nombrePb=" + nombrePb + ", unidadHor=" + unidadHor + ", unidadVer=" + unidadVer
				+ ", cantidadVendida=" + cantidadVendida + "]";
	}

	
}
