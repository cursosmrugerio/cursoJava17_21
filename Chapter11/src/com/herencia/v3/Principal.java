package com.herencia.v3;

import java.io.IOException;

class Ave {
	Ave() {
	}
}

class Aguila extends Ave{
	Aguila() throws Exception {
	}
}

public class Principal {
	public static void main(String[] args) {
		Ave ave = new Ave();
		
		try {
			Ave aguila = new Aguila();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
