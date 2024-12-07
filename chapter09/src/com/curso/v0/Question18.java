package com.curso.v0;

public class Question18 <Z extends Exception> {
	
	Z myException;

	public static void main(String[] args) {
	}

	 public static <T extends Number> T identity(T t) {
		//System.out.println(myException);
		return t;
	}

}
