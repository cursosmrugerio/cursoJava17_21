package com.curso;

public class Question09 {

	public static void main(String[] args) {

		int count = 0;

		BUNNY: for (int row = 1; row <= 3; row++)

			RABBIT: for (int col = 0; col < 3; col++) {
				if ((col + row) % 2 == 0)
					continue RABBIT;
				count++;
			}
		
		//break BUNNY;
		//count   row    col 
		//  0      1      0
		//  1             1
		
		//break RABBIT;
		//count   row    col 
		//  0      1      0
		//  1             1
		//         2      0
		//         3      0
		//  2             1
		//         4
		
		
		
		System.out.println(count); //2
	}

}
