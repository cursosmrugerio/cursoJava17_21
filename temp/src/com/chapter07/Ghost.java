package com.chapter07;

public class Ghost {
	public static void boo() {
		System.out.println("Not scared");
	}

	protected class Spirit {
		public void boo() {
			System.out.println("Booo!!!");
		}
	}

	public static void main(String... haunt) {
		var g = new Ghost().new Spirit() {};
		Ghost.boo();
	}
}
