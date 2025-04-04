package com.curso.v0;


sealed interface Readable{ }  

non-sealed class Device implements Readable { }  

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello");
	}
}
