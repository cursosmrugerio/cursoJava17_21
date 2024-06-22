package com.curso.v0;

public class Principal {

	public static void main(String[] args) {

		
		long l;
		
		l = Long.valueOf(800); //Unboxing
		
		Long lw;
		
		lw = Long.MAX_VALUE; //Autoboxing
		
		l = 7;
		
		//lw = 0;
		
		byte b1 = 4;
		byte b2 = 5;
		
		byte b3 = (byte)(b1+b2);
		
		System.out.println(b3);
		
		byte b4 = 4;
		byte b5 = 5;
		
		b4 += b5;
		
		System.out.println(b4);
		
	}

}
