package com.curso.v0;

import java.util.HashMap;

public class Question19 {

	public static void main(String[] args) {

		var map = new HashMap<Integer, Integer>();

		map.put(1, 10);
		map.put(2, 20);
		map.put(3, 1);
		map.merge(1, 3, (a, b) -> a + b);
		map.merge(3, 100, (a, b) -> a + b);
		map.merge(4, 8, (a, b) -> a + b);
		System.out.println(map);
	}

}
