package com.curso.v0;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Question01 {

	public static void main(String[] args) throws IOException {
		new Question01().whatHappensNext();
		System.out.println("EndProgram");
	}
	
	public void whatHappensNext() throws IOException {
		throw new FileNotFoundException();
		//throw new RuntimeException();
		//throw new java.io.IOException();
		//System.out.println("it's ok");
		//throw new Exception();
		//throw new IllegalArgumentException();
	}

}
