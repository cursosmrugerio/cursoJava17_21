package com.exceptions.v0;

public class Test {
	
	public static void doStuff() throws Exception {
		System.out.println("Doing stuff...");
		double d = Math.random();
		System.out.println(d);
		if (d > 0.4) { //0.5
			throw new Exception("Too high!");
		}
		System.out.println("Done stuff.");
	}

	public static void main(String[] args) throws Exception {
		doStuff();
		System.out.println("Over");
	}
}

//Math.random() > 0.4 true
/*
Doing stuff...
Exception in thread "main" java.lang.Exception: Too high!
	at TestClass.doStuff(TestClass.java:29)
	at TestClass.main(TestClass.java:41)
*/

//Math.random() > 0.4 false
/*
Doing stuff...
Done stuff.
Over
*/


