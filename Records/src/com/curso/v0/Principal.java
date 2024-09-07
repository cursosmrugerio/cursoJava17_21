package com.curso.v0;

public class Principal {

	public static void main(String[] args) {

		Iguana iguana = new Iguana(5);
		
		System.out.println(iguana);
		System.out.println("age: "+iguana.age());
		
		//Chameleon cham = new Chameleon();
		System.out.println(Chameleon.getName());
		
		BeardedDragon bd = new BeardedDragon(false);
		System.out.println(bd.fun());
		
	}

}
