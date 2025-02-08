package com.herencia.v1;

import java.io.IOException;

class Ave {
	Ave() throws IOException{
	}
}

class Aguila extends Ave{
	Aguila() throws Exception {
	}
}

public class Principal {
	
	public static void main(String[] args) {
		try {
			Ave a = new Aguila();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
