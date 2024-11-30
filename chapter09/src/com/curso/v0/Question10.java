package com.curso.v0;

import java.util.*;

public class Question10 {

	public static void main(String[] args) {

		var list = List.of(1, 2, 3);
		var set = Set.of(1, 2, 3);
		var map = Map.of(1, 2, 3, 4);//{1=2,3=4}
		
		list.forEach(System.out::println);
//
		set.forEach(System.out::println);
//
//		map.forEach(System.out::println);
//
//		map.keys().forEach(System.out::println);
//
		map.keySet().forEach(t -> System.out.println(t));
//
		map.values().forEach(System.out::println);
//
//		map.valueSet().forEach(System.out::println);
		
		System.out.println("****");
		
		map.forEach((x,y) -> 
		     System.out.println("Clave: "+x+" ,Valor: "+y));
		System.out.println("*********");
		
		map.entrySet().forEach(
				t -> System.out.println("Clave: "+t.getKey()+" ,Valor: "+t.getValue()));
	}

}
