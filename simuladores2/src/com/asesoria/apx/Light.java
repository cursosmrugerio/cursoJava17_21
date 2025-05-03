package com.asesoria.apx;

class Light {
    protected int lightsaber(int x) { return 0; }
}

class Saber extends Light {
	//private int lightsaber(int x) { return 0; }
	//protected int lightsaber(long x) { return 0; } //VALIDA
	//private int lightsaber(long x) { return 0; }  //VALIDA
	//protected long lightsaber(int x) { return 0; }
	//protected long lightsaber(int x, int y) { return 0; } //VALIDA
	//public int lightsaber(int x) { return 0; } //VALIDA
	protected long lightsaber(long x) { return 0; } //VALIDA
}

 
