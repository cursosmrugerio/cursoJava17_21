package com.curso.v0;

import java.util.*;

import java.util.stream.IntStream;

public class Question08 {

	public static void main(String[] args) {
		IntStream is1 = IntStream.empty();
		OptionalDouble od = is1.average();
		IntStream is2 = IntStream.empty();
		OptionalInt oi = is2.findAny();
		IntStream is3 = IntStream.empty();
		int i = is3.sum();
		
		System.out.println(od);
		System.out.println(oi);
		System.out.println(i);

		
		
		
	}

}
