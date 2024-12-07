package com.curso.v1;

import java.util.Comparator;
import java.util.TreeSet;

public record Sorted(int num, String text) implements Comparable<Sorted> {

// Returns string representation of the num field
	public String toString() {
		return "" + num;
	}

// Implements Comparable interface
// Compares based on text field
	@Override
	public int compareTo(Sorted s) {
		return text.compareTo(s.text);
	}

	public static void main(String[] args) {
		// Create two Sorted objects
		var s1 = new Sorted(88, "a");
		var s2 = new Sorted(55, "b");

		// Create first TreeSet
		var t1 = new TreeSet<Sorted>();
		t1.add(s1);
		t1.add(s2);

		System.out.println(t1); // 88,55

		var t2 = new TreeSet<Sorted>((x, y) -> x.num - y.num);
		t2.add(s1);
		t2.add(s2);

		System.out.println(t2); // 55,88

//    // Print both TreeSets
		System.out.println(t1 + " " + t2);
	}
}
