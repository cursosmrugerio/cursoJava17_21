package com.curso.v0;

import java.util.*;
import java.util.Map.Entry;
import java.util.function.*;

public class Question17B {

	public static void main(String[] args) {

		// Map<Integer,Integer>
		var map = Map.of(1, 2, 3, 6);

		Set<Entry<Integer,Integer>> objSet = map.entrySet();
		System.out.println(objSet.getClass().getName());

		// List<Entry<Integer,Integer>>
		var list = List.copyOf(map.entrySet());

		var otherList = new ArrayList<>(list);

		List<Integer> one = List.of(8, 16, 2);
		// List<Integer> //Lista Inmutable
		var copy = List.copyOf(one);
		// List<Integer> //Lista Inmutable
		var copyOfCopy = List.copyOf(copy);
		// ArrayList<Integer> //Lista Mutable
		var thirdCopy = new ArrayList<>(copyOfCopy);

		// Function: T -> U
		Function<Entry<Integer, Integer>, Integer> fun = x -> x.setValue(x.getValue() * 2);

		// UnaryOperator: T -> T
		UnaryOperator<Entry<Integer, Integer>> uo = x -> {
			x.setValue(x.getValue() * 2);
			return x;
		};

		// list.replaceAll(uo);
		
		System.out.println(otherList); //2,6
		otherList.replaceAll(uo);
		System.out.println(otherList); //4,12

	}

}
