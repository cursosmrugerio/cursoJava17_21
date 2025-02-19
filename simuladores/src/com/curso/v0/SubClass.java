package com.curso.v0;

class BaseClass {
	public void print(String s) {
		System.out.println("BaseClass :" + s);
	}
}

class SubClass extends BaseClass {
	public void print(String s) {
		System.out.println("SubClass :" + s);
		super.print(s);
	}

	public static void main(String args[]) {
		SubClass sc = new SubClass();
		sc.print("location");
	}
}