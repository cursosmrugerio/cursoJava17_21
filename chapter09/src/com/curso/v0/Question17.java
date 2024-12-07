package com.curso.v0;

import java.util.*;
import java.util.Map.Entry;
import java.util.function.*;

public class Question17 {

	public static void main(String[] args) {

		// Map<Integer,Integer>
		var map = Map.of(1, 2, 3, 6);

//		Set<Entry<Integer,Integer>> objSet = map.entrySet();
//		System.out.println(objSet.getClass().getName());

		// List<Entry<Integer,Integer>>
		var list = List.copyOf(map.entrySet());

		//list.replaceAll(x -> x * 2); //NO COMPILA
		
		List<Integer> one = List.of(8, 16, 2);
		// List<Integer> //Lista Inmutable
		var copy = List.copyOf(one);
		// List<Integer> //Lista Inmutable
		var copyOfCopy = List.copyOf(copy);
		// ArrayList<Integer> //Lista Mutable
		var thirdCopy = new ArrayList<>(copyOfCopy);

		//one.replaceAll(x -> x * 2); //Runtime Exception
		thirdCopy.replaceAll(x -> x * 2);
		System.out.println(thirdCopy);
	}

}
