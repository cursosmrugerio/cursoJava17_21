package com.curso.v0;

class Animal{
	static void getSound(){
		System.out.println("zzzzzzzzz");
	}
}

class Dog extends Animal{
	static void getSound(){
		System.out.println("Guau guau");
	}
}

public class Question20 {

	public static void main(String[] args) {
		Animal animal = new Dog();
		animal.getSound();
		
		//Animal.getSound();
	}

}
