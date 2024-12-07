package com.curso.v0;

import java.util.*;
import java.util.Map.Entry;
import java.util.function.*;

public class Question17A {

	public static void main(String[] args) {

		// Map<Integer,Integer>
		var map = Map.of(1, 2, 3, 6);
		System.out.println(map);
		
		var otherMap = new HashMap<>(map);
		
		//BiFunction (T,U) -> R
		otherMap.replaceAll((key,value)->value*2);
		
		System.out.println(otherMap);
		

	}

}
