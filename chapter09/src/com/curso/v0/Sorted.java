package com.curso.v0;

import java.util.Comparator;
import java.util.TreeSet;

public record Sorted(int num, String text) implements 
			Comparable<Sorted>, Comparator<Sorted> {

// Returns string representation of the num field
	public String toString() {
		return "" + num;
	}

// Implements Comparable interface
// Compares based on text field
	public int compareTo(Sorted s) {
		return text.compareTo(s.text);
	}

// Implements Comparator interface
// Compares based on num field
	public int compare(Sorted s1, Sorted s2) {
		return s1.num - s2.num;
	}

	public static void main(String[] args) {
		// Create two Sorted objects
		var s1 = new Sorted(88, "a");
		var s2 = new Sorted(55, "b");

		// Create first TreeSet
		var t1 = new TreeSet<Sorted>();
		t1.add(s1);
		t1.add(s2);
		
		System.out.println(t1); //88,55

//    // Create second TreeSet initialized with s1's comparator
		var t2 = new TreeSet<Sorted>(s1);
		t2.add(s1);
		t2.add(s2);
		
		System.out.println(t2); //55,88

//    // Print both TreeSets
//    System.out.println(t1 + " " + t2);
	}
}
