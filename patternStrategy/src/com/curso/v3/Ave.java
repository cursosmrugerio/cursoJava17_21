package com.curso.v3;

public abstract class Ave {
	
	ComportamientoVolar cv; //HAS-A
	
	void volar() {
		cv.ejecutarVuelo();
	}


}
