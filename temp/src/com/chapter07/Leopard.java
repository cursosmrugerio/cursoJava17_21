package com.chapter07;

import java.util.ArrayList;
import java.util.List;

interface Walk {
	private static List move() {
		return null;
	}
}

interface Run extends Walk {
	public ArrayList move();
}

class Leopard implements Walk {

	public List move() { // X

		return null;

	}
}

class Panther implements Run {

	public ArrayList move() { // Z

		return null;

	}
}
