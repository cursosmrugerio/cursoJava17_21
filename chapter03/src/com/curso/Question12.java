package com.curso;

public class Question12 {

	public static void main(String[] args) {
		int sing = 8, squawk = 2, notes = 0; 
		while(sing > squawk) { 
			sing--; 
			squawk += 2;
			notes += sing + squawk;
		} 
		System.out.println(notes);
	}

	//sing       squawk      notes
	//  8           2          0
	//  7           4         11
	
	//  6           6         23
	
}
