package com.generics.v0;

import java.util.*;

class A{}
class B extends A{}
class C extends B{}

public class Principal {
	
	public static void main(String[] args) {
		List<B> lista = new ArrayList<B>();
		lista.add(new C());
		new Principal().one(lista, new B());
		new Principal().third(lista, new C());
	}

	<Z extends A> Z one(List<B> list,Z z) {
		Z otherZ = z;
		System.out.println(z);
		B b = list.get(0); 
		return otherZ;
	}
	
	<Z extends A> B third(List<B> list,Z z) {
		System.out.println(z);
		B b = list.get(0); 
		return new B();
	}
	
	
	
	//<X> void fifth(List<X super B> list) { } //DOES NOT COMPILE

}
