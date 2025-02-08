package com.herencia.v0;

import java.io.FileNotFoundException;
import java.io.IOException;

class Ave {
	void volar() throws IOException {
	}
}

class Aguila extends Ave{
	@Override
	void volar() throws FileNotFoundException {
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
