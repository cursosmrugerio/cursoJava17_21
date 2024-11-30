package com.curso.v0;

import java.io.FileNotFoundException;

public class Helper {

	public static <U extends Exception> 
						void printException(U u) {
		System.out.println(u.getMessage());
	}
	
	public static void main(String[] args) {
		printException(new FileNotFoundException("A"));
		printException(new Exception("B"));
		//Helper.<Throwable>printException(new Exception("C"));
		Helper.<NullPointerException>printException(new NullPointerException ("D"));
		//Helper.printException(new Throwable("E"));
	}
}
