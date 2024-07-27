package chapter04;

public class Question02 {

	public static void main(String[] args) {

		int[][] scores = new int[5][];
		
		scores[0] = new int[4];
		scores[0][0] = 1;
		scores[0][1] = 2;
		scores[0][2] = 3;
		scores[0][3] = 4;
		
		scores[1] = new int[2];
		scores[1][0] = 5;
		scores[1][1] = 6;
		
		scores[2] = new int[1];
		scores[2][0] = 7;
		
		scores[3] = new int[3];
		scores[3][0] = 8;
		scores[3][1] = 9;
		scores[3][1] = 10;
		
		System.out.println(scores[3].length);
		
		scores[4] = new int[20];
		
		System.out.println(scores);
	}

}
