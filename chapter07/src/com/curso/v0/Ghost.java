package com.curso.v0;

public class Ghost {

	public static void boo() {
		System.out.println("Not scared");
	}

	// INNER CLASS
	protected class Spirit {
		public void boo() {
			System.out.println("Booo!!!");
		}
	}

	public static void main(String... haunt) {
		var g = new Ghost().new Spirit(){};
		
		//g.super.boo();
		new Ghost().boo();
		Ghost.boo();
		//new Spirit().boo();

	}

}
