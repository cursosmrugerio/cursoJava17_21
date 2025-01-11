package com.chapter10;

import java.util.*;

public class Question07 {

	public static void main(String[] args) {

	}

	private static List<String> sort(List<String> list) {
		var copy = new ArrayList<String>(list);
		Collections.sort(copy, (a, b) -> b.compareTo(a));
		return copy;
	}

}
