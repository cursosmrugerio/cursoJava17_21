package com.curso.v0;

import java.util.*;

public class Wildcard {

	public void showSize(List<?> list) {
		System.out.println(list.size());
	}

	public static void main(String[] args) {

		Wildcard card = new Wildcard();
		
		ArrayList <? extends Number> list = 
				new ArrayList <Integer>();
		
//		List<? extends Exception> list = 
//				new LinkedList<java.io.IOException>();
		//List<?> list = new ArrayList<>();
		//ArrayList<? super Date> list = new ArrayList<Date>();
		//List<?> list = new LinkedList<String>(); //SI
		//List<StringBuilder> list = new ArrayList<>();
		
		card.showSize(list);
	}
}