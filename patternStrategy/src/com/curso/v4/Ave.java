package com.curso.v4;

public abstract class Ave {
	
	ComportamientoVolar cv; //HAS-A
	
	Ave(){
		cv = new SiVolar();
	}
	
	void volar() {
		cv.ejecutarVuelo();
	}

}
