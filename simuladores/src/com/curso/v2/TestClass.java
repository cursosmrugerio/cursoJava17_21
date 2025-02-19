package com.curso.v2;

class Bird {
	
	String name;
	int age;
	
	Bird(){
		this("SinNombre");
		System.out.println("Constructor vacio");
	}
	Bird(String name){
		this(name,0);
		this.name = name;
		System.out.println("Constructor con String");
	}
	Bird(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		System.out.println("Constructor con String e int");
	}
	
}

public class TestClass {
	public static void main(String[] args) {
		Bird b = new Bird();
		//Constructor con String e int
		//Constructor con String
		//Constructor vacio
	}

}
