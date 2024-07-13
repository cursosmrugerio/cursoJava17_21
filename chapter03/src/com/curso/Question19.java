package com.curso;

public class Question19 {

	public static void main(String[] args) {

		double iguana = 0;
		int snake = 1;
		do {
			//int snake = 1; //NO COMPILA
			System.out.print(snake++ + " ");
			iguana--;
		} while (snake <= 5);
		System.out.println(iguana);

	}

}
