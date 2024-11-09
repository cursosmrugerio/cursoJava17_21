package com.curso.linked.v1;

import java.util.*;

public class Rules {
	
	public static void main(String[] args) {
		List<Integer> integers = new ArrayList<>();
        integers.add(10);
        
        List<Number> numbers = new ArrayList<>();
        numbers.add(20.0);

        List<String> languages = new ArrayList<>();
        languages.add("English");
        
        //integers = languages;
        //numbers = integers;
        
        Number n = 10.0;
        Integer i = 5;
        n = i;
        
	}

}
