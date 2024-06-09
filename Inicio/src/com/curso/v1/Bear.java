package com.curso.v1;

public class Bear {
	
	private Bear pandaBear;

	private void roar(Bear b) {
		System.out.println("Roar!");
		pandaBear = b;
	}

	public static void main(String[] args) {
		Bear brownBear = new Bear(); 
		Bear polarBear = new Bear(); 
		brownBear.roar(polarBear);
		
		brownBear.pandaBear.pandaBear = brownBear;
		
		System.out.println(brownBear == brownBear.pandaBear.pandaBear);
		
		polarBear = null;
		brownBear = null; 
		System.gc();
	}
}
