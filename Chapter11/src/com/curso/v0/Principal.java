package com.curso.v0;

import java.io.IOException;

public class Principal {

	public static void main(String[] args) {
		fall(15);
		System.out.println("Fin Programa");
	}

	static void fall(int distance) {

		try {
			if (distance > 10)
				throw new IOException();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
