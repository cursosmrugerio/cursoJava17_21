package com.curso.v0;

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
		
		Dog animal1 = new Dog();
		
		String sonido;
		
		sonido = animal1.makeSound();
		
		System.out.println(sonido);
		
		//animal1 = new Cat();
		
		Cat animal2 = new Cat();

	}

}
