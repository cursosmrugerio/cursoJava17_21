package com.curso.v0;

public record Hello<T>(T t) {
	
//	public Hello(T t) { 
//		this.t = t; 
//	}
	
	private <T> void println(T t) { 
		System.out.print(this.t + "-" + t);
	}
	
	public static void main(String[] args) {
		new Hello<String>("hi").println(1); //hi-1
		new Hello("hola").println(true);//hola-true
	}
}
