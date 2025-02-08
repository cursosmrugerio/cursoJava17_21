package com.curso.v0;

import java.io.IOException;

public class Principal1 {

	public static void main(String[] args) throws IOException {
		fall(15);
		System.out.println("Fin Programa");
	}

	static void fall(int distance) throws IOException {
		if (distance > 10) {
			throw new IOException();
		}
	}

}
