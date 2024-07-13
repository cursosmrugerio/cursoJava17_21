package com.curso;

public class PrintIntegers {

	public static void main(String[] args) {

		int y = -2;

		do
			System.out.print(++y + " ");
		while (y <= 5);
		
		// y
		// -2
		// -1, 0, 1, 2, 3, 4, 5, 6
	}

}
