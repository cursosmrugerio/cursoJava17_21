package com.herencia.v2;

import java.io.IOException;

class Ave {
	void volar() throws IOException {
	}
}

class Aguila extends Ave {
	@Override
	void volar() {
		System.out.println("Aguila Volar");
	}
}

public class Principal {

	public static void main(String[] args) {
		Ave a = new Aguila();
		try {
			a.volar();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
