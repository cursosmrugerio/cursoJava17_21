package com.generics.v0;

public class Truthy {

	public static void main(String[] args) {
		
		int i = 1;
		int j = i++; //i=2, j=1  
		if ((i == ++j) | (i++ == j)) {
		    i += j;
		}
		System.out.println(i);
		System.out.println(j);
		
		//i   j
		//1   1
		//2
		//    2
		//3
		//5


//		int x = 8;
//		
//		assert (x == 6) ? true : false :"x no igual a 6";
//		
//		System.out.println(x);
	}

}
