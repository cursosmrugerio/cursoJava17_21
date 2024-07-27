package chapter04;

import java.util.Arrays;

public class Question2A {

	public static void main(String[] args) {

		int[][] scores = new int[5][];
		
		scores[0] = new int[]{1,2,3,4};

		scores[1] = new int[2];
		scores[1][0] = 5;
		scores[1][1] = 6;
		
		scores[2] = new int[1];
		scores[2][0] = 7;
		
		scores[3] = new int[]{8,9,10};
		
		scores[4] = new int[20];
		
		//System.out.println(Arrays.toString(scores));
		
		for (int[] arrayInt:scores) {
			System.out.println(Arrays.toString(arrayInt));
		}
	}

}
