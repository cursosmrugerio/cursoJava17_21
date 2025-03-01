package com.curso.v0;

import java.io.*;

public class Question07 {
		
	public void tryAgain(String s) throws FileNotFoundException {
	    try (FileReader r = null; FileReader p = new FileReader("")) {
	        System.out.print("X");
	        throw new IllegalArgumentException();
	    } catch (Exception e) {
	        System.out.print("A");
	        throw new FileNotFoundException();
	    } finally {
	        System.out.print("0");
	    }
	}


}
