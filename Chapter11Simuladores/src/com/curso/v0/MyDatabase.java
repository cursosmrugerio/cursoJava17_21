package com.curso.v0;

class Problem extends Exception {
	public Problem() {
	}
}

class YesProblem extends Problem {
}

public class MyDatabase {
	public static void connectToDatabase() throws Problem {
		throw new YesProblem(); //<==
	}

	public static void main(String[] c) throws Exception {
		connectToDatabase();
		System.out.println("EndProgram");
	}
}
