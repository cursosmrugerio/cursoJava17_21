package com.curso.v7;

import java.util.Random;

class Bird {
	
	void fly() {
		System.out.println("Bird Fly");
	}
	
	void flyBird() {
		System.out.println("Bird flyBird()");
	}

}

class Parrot extends Bird {
	
	@Override
	void fly() {
		System.out.println("Parrot Fly");
	}
	void flyParrot() {
		System.out.println("Parrot flyParrot()");
	}

}

public class Macaw extends Parrot {

	@Override
	void fly() {
		System.out.println("Macaw Fly");
	}
	
	void flyMacaw() {
		System.out.println("Macaw flyMacaw()");
	}
	
	public static void main(String[] args) {
		
		System.out.println("V7");
		
		Bird ave = getBird();
		
		ave.fly();
		ave.flyBird();
		if (ave instanceof Parrot a)
			a.flyParrot();
		if (ave instanceof Macaw a)
			a.flyMacaw();

	}

	private static Bird getBird() {
		Bird[] aves = {new Bird(),
				new Parrot(),
				new Macaw()
				};
		int random = new Random().nextInt(aves.length);
		Bird ave = aves[random];
		System.out.println("Return: "+ave.getClass().getSimpleName());
		return ave;
	}
}

