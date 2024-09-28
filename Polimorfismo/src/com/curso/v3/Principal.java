package com.curso.v3;

import java.util.Random;

abstract class Animal {
	abstract String makeSound();
}

class Dog extends Animal {
	@Override
	String makeSound(){
		return "Guau guau";
	}
}

class Cat extends Animal {
	@Override
	String makeSound(){
		return "Miau miau";
	}
}

class Duck extends Animal {
	@Override
	String makeSound(){
		return "Kuaq kuaq";
	}
}

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("Abstract");
		
		String sonido;
		
		Animal animal = getAnimal();
		
		sonido = animal.makeSound(); 
		
		System.out.println(sonido);
		
		

	}

	private static Animal getAnimal() {
		Animal[] animals = {
				//new Animal(),
				new Dog(),
				new Cat(),
				new Duck()
		};
		
		int i = new Random().nextInt(animals.length);
		
		return animals[i];
	}

}
