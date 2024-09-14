package com.curso.v1;

import java.util.*;

interface Walk {
	static List move() {
		System.out.println("Paso por Walk move()");
		return null;
	}
}

interface Run extends Walk {
	public ArrayList move();
}

public class Leopard implements Walk {

	static public List move() {
		System.out.println("Paso por Leopard move()");
		return null;
	}

	public static void main(String[] args) {
		Walk.move();
		Leopard.move();
	}

}
