package com.curso.v2;

public abstract class Ave {
	
	ComportamientoVolar cv; //HAS-A
	
	void volar() {
		cv.ejecutarVuelo();
	}


}
