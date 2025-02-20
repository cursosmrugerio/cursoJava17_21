package com.curso.v5;

import java.util.ArrayList;
import java.util.List;

public class Principal2 {

	public static void main(String[] args) {
		
//		ArrayList<String> in = null;
//		List<CharSequence> result = null;
		
//		List<String> in = null;
//		List<Object> result = null;
		
		//CORRECTA
		ArrayList<String> in = null; 
		List result;
		
//		List<CharSequence> in = null; 
//		List<CharSequence> result;
		
//		ArrayList<Object> in = null;
//		List<CharSequence> result;
		
		result = doIt(in);
	}
	
	//DEFINICION DE UN GENERIC A NIVEL METODO
	//CharBuffer, Segment, String, StringBuffer, StringBuilder
	public static <E extends CharSequence> List<? super E> doIt(List<E> nums) {
		return null;
	}

}



