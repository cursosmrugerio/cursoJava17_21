package com.curso.v0;

public class FinallyTest {
	public static void main(String args[]) throws Exception {
		try {
			System.out.println("A");
			m1(); // <== Avienta la exception
		} 
		
//		catch (Exception e) {
//			System.out.println("AA");
//		} 
		
		finally {
			System.out.println("B");
		}
		System.out.println("C");
	}

	public static void m1() throws Exception {
		throw new Exception();
	}
}

//B y Arroja la exception

//AA B C

//A B C