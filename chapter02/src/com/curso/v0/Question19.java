package com.curso.v0;

public class Question19 {

	public static void main(String[] args) {

		int start = 7;

		int end = 4;
		
		// end = end + ++start;
		//     =   4  + 8
		end += ++start; //12
		
		System.out.println(end);
		
		
		//                    128
		start = (byte)(Byte.MAX_VALUE + 2); 
		
		System.out.println(start); //-128
		
		start = (short)(Short.MAX_VALUE + 100); 
		
		System.out.println(start); //-32 768
	}

}
