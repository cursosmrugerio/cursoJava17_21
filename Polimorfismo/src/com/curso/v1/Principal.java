package com.curso.v1;

class Animal {
	String makeSound(){
		return "zzzzzzzz";
	}
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
		
		String sonido;
		
		Animal animal = new Dog();
		
		sonido = animal.makeSound(); //<==
		
		System.out.println(sonido);
		
		animal = new Cat();
		
		sonido = animal.makeSound(); //<==
		
		System.out.println(sonido);
		
		animal = new Duck();

		sonido = animal.makeSound(); //<==
		
		System.out.println(sonido);

	}

}
