package com.book17.v0;

import java.util.*;

class A {} 
class B extends A {} 
class C extends B {}

public class Principal {

	public static void main(String[] args) {
		
		List<B> listaB = new ArrayList<>();
		listaB.add(new B());
		B b1 = new Principal().one(listaB);
		
		B b2 = new Principal().second(listaB, new C());
		
		B b4 = new Principal().fourth(listaB, new C());
		

	}
	
	B one(List<B> list) { 
		System.out.println("Paso por one()");
		return new B();
		//return list.get(0);
	}
	
	<T extends A> B second(List<B> list, T t) {
		System.out.println("Paso por second()");
		System.out.println(t);
		return new B();  
	}
	
	<PATO extends A> B fourth(List<B> list, PATO pato) {
		System.out.println("Paso por fourth()");
		System.out.println(pato);
		return new B();  
	}

//	<B extends A> B third(List<B> list) { 
//		return new B(); // DOES NOT COMPILE 
//	}

}
