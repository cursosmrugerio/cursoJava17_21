package com.curso.v0;

public class Bear {
	
	private Bear pandaBear;

	private void roar(Bear b) {
		System.out.println("Roar!");
		pandaBear = b;
	}

	public static void main(String[] args) {
		Bear brownBear = new Bear(); // 13 o 14
		Bear polarBear = new Bear(); // 12 o 13
		brownBear.roar(polarBear);
		
		System.out.println(polarBear == brownBear.pandaBear); //TRUE
		
		polarBear = null;
		brownBear = null; //AQUI SON ELEGIBLES
		System.gc();
	}
}
