package com.curso.v4;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		List s1 = new ArrayList();
		s1.add("a"); 
		s1.add("b");
		s1.add("c"); //<==
		s1.add("a");
		
//		boolean b = s1.remove("a");
//		System.out.println(b); //true
//		s1.forEach(System.out::println);
		
		if(s1.remove("a")) { //true
			if (s1.remove("a")) { //true
				Object o = s1.remove(1); 
				System.out.println("Object: "+o);
			}else {
				s1.remove("c");
			}
		}
		
		System.out.println(s1);
		
		
	}

}
