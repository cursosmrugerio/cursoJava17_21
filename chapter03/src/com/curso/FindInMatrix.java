package com.curso;

public class FindInMatrix {
	public static void main(String[] args) {

		int[][] list = { { 1, 13 }, { 5, 2 }, { 2, 2 } };

		int searchValue = 2; // (1,1) (2,0) (2,1)
		int positionX = -1;
		int positionY = -1;

		PATO1: for (int i = 0; i < list.length; i++) {
			PATO2: for (int j = 0; j < list[i].length; j++) {

				if (list[i][j] == searchValue) {
					positionX = i;
					positionY = j;
					System.out.println("***(" + positionX + "," + positionY + ")");
					continue;
				}
			}
		}

		if (positionX == -1 || positionY == -1) {
			System.out.println("Value " + searchValue + " not found");
		} else {
			System.out.println("Value " + searchValue + " found at: " + "(" + positionX + "," + positionY + ")");
		}

	}

}