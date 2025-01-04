package com.streams.v0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Principal {

	public static void main(String[] args) {

		List<String> list = List.of("Toby", "Anna", "Leroy", "Alex");
		List<String> filtered = new ArrayList<>();
		
		for (String name: list) 
			if (name.length() == 4) 
				filtered.add(name);
		
		Collections.sort(filtered);
		
		Iterator<String> iter = filtered.iterator();
		
		if (iter.hasNext()) 
			System.out.println(iter.next()); //Alex
		
		if (iter.hasNext()) 
			System.out.println(iter.next()); //Anna		
	}

}
