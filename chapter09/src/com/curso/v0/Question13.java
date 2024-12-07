package com.curso.v0;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Question13 {

	public static void main(String[] args) {

		Comparator<Integer> c1 = (o1, o2) -> o2 - o1;

		Comparator<Integer> c2 = Comparator.naturalOrder();

		Comparator<Integer> c3 = Comparator.reverseOrder();
		
		var list = Arrays.asList(5, 4, 7, 2);
		
		Collections.sort(list, c2 ); //2,4,5,7
		
		Collections.reverse(list); //7,5,4,2 
		
		Collections.reverse(list); //2,4,5,7
		
		//Lista Ordenada de forma Ascendente
		System.out.println(Collections.binarySearch(list, 6)); //-4
	}

}
