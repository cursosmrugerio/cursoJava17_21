package com.curso.v0;

public class Question09 {

	public static void main(String[] args) {
		
		int a = 2, b = 4, c = 2;

		//                 false
		System.out.println(a > 2 ? --c : b++); //4
		
		System.out.println("b: "+b); //5
		System.out.println("c: "+c); //2
		
		//                      false       
		System.out.println(b = (a!=c ? a : b++)); //5
		//System.out.println(a!=c ? a : b++); //5
		System.out.println("b: "+b); //5
		
		//a=2
		//b=5
		//c=2
		//                   false
		//System.out.println(a > b ? (b < c ? b : 2 ): 1);
		
		
		System.out.println(a > b ? b < c ? b : 2 : 1);

		
	}

}
