package com.curso.v5;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		//in: 
		//List<CharSequence> in = null;
		//List<StringBuilder> in = null;
		//List<String> in = null;
		//List<Integer> in = null; //INCORRECTO
		//ArrayList<CharSequence> in = null;
		ArrayList<String> in = null;
		
		//List<? super CharSequence> result = null;
		List<? super String> result = null; 
		//List<? super StringBuilder> result = null;
				
		result = doIt(in);
	}
	
	//DEFINICION DE UN GENERIC A NIVEL METODO
	//CharBuffer, Segment, String, StringBuffer, StringBuilder
	public static <E extends CharSequence> List<? super E> doIt(List<E> nums) {
		return null;
	}

}



