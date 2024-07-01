package com.curso.v0;

public class Question20 {

	public static void main(String[] args) {

		int myFavoriteNumber = 8; 
		// (-1*8) -1 
		int bird = ~myFavoriteNumber; //-9
		System.out.println(bird); //-9
		
		int plane = -myFavoriteNumber; //-8
		
		System.out.println("plane: "+plane); 
		
		var superman = (bird == plane ? 5 : 10);
		
		System.out.println("superman: "+superman);
		
		//                  -9            -8             9
		System.out.println(bird + "," + plane + "," + --superman);
		

	}

}
