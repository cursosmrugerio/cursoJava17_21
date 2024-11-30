package com.curso.v0;

import java.util.*;

public class Question04 {

	public static void main(String[] args) {

		//HashSet<Number> hs = new HashSet<Integer>();
		
		HashSet<?> hs1 = new HashSet<Integer>();
		//hs1.add(10);
		HashSet<? extends Number> hs2 = new HashSet<Integer>();
		//hs2.add(10);
		HashSet<? super Integer> hs3 = new HashSet<Integer>();
		hs3.add(10);
		
		HashSet<? super ClassCastException> set = 
				new HashSet<Exception>();
		
		
		List<String> list = new ArrayList<>();
		
		Set<Object> values = new HashSet<Object>();
		
		List<? extends Object> objects = 
				new ArrayList<StringBuilder>();
		
		Map<String, ? extends Number> hm = 
					new HashMap<String, Integer>();
	}

}
