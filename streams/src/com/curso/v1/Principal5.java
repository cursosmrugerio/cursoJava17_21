package com.curso.v1;

import java.util.TreeSet;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

public class Principal5 {

	public static void main(String[] args) {

		Stream<String> stream = Stream.of("w", "o", "l", "w" ,"f");
		
//		TreeSet<String> set = stream.collect(
//				() -> new TreeSet<>(), 
//				(treeSet,string) -> treeSet.add(string), 
//				(treeSet1, treeSet2) -> treeSet1.addAll(treeSet2));

		TreeSet<String> set = stream.collect(
				TreeSet::new, 
				TreeSet::add, 
				TreeSet::addAll);

		System.out.println(set); // [f, l, o, w]

		
	}

}
