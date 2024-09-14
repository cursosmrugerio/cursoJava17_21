package com.curso.v0;

import java.util.*;

interface Walk {
	private static List move() {
		System.out.println("Paso por Walk move()");
		return null;
	}
}

interface Run extends Walk {

	public ArrayList move();
}

class Panther implements Run {

	@Override
	public ArrayList move() { // Z

		return null;

	}
}

public class Leopard implements Walk {

	public Object move() {
		System.out.println("Paso por Leopard move()");
		return null;
	}

	public static void main(String[] args) {

	}

}
