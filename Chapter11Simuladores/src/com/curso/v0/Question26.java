package com.curso.v0;

import java.io.IOException;

public class Question26 {

	void rollOut() throws ClassCastException {
	}

	public void transform(String c) {
		try {
			rollOut();
		} catch (IllegalArgumentException | ClassCastException f) {
			System.out.println("PASO");
		}
	}
	
	public void transform2(String c) throws IOException {
		try {
			rollOut();
		} catch (IllegalArgumentException e){
			
		}
	}
}
