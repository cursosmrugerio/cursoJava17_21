package com.curso.v4;

import java.util.Random;

interface Animal {
	String makeSound(); //public abstract
}

class Dog implements Animal {
	@Override
	public String makeSound(){
		return "Guau guau";
	}
}

class Cat implements Animal {
	@Override
	public String makeSound(){
		return "Miau miau";
	}
}

class Duck implements Animal {
	@Override
	public String makeSound(){
		return "Kuaq kuaq";
	}
}

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("Interface");
		
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