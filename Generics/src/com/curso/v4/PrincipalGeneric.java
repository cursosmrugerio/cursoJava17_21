package com.curso.v4;

public class PrincipalGeneric {

	public static void main(String[] args) {
		
		Integer[] intArray = {1,2,3,4,5};
		Double[] doubleArray = {1.1,2.2,3.3,4.4,5.5};
		Character[] charArray = {'H','O','L','A'};
		
		//showIntegers(intArray);
		//showIntegers(doubleArray);
		//showIntegers(charArray);
		
		show(intArray);
		show(doubleArray);
		show(charArray);
	
	}
	

	private static <T> void show(T[] array) {
		for (T t: array)
			System.out.println(t);
	}

	private static void showIntegers(Integer[] intArray) {
		for (Integer i: intArray)
			System.out.println(i);
	}

}
