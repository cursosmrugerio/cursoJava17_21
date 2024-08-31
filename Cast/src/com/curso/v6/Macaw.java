package com.curso.v6;

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
		
		Bird ave = getBird();
		
		ave.fly();
		ave.flyBird();
		if (ave instanceof Parrot)
			((Parrot)ave).flyParrot();
		if (ave instanceof Macaw)
			((Macaw)ave).flyMacaw();

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

