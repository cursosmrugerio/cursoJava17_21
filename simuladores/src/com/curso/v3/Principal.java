package com.curso.v3;

class A {
	public void perform_work() {
		System.out.println("A");
	}
}

class B extends A {
	public void perform_work() {
		System.out.println("B");
		//super.perform_work();
	}
}

class C extends B {
	public void perform_work() {
		System.out.println("C");
		super.perform_work();
	}
}

public class Principal {
	
	public static void main(String[] args) {
		C c = new C();
		c.perform_work();
	}
	
}
