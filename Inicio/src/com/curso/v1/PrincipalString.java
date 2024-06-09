package com.curso.v1;

public class PrincipalString {

	public static void main(String[] args) {

		String s1 = "Hello";
		
		String s2 = new String("Hello");
		
		System.out.println(s1==s2.intern());
		
		String s3 = "He" + "llo";
		
		System.out.println(s1==s3);
		
		String s4 = ("He"+ s1.substring(2)).intern();
		
		System.out.println(s4);
		
		System.out.println(s1==s4);
		
		String s5 = new StringBuilder("Hello").toString().intern();
		
		System.out.println(s1 == s5);

		
	}

}
