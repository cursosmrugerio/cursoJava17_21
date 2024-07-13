package com.curso;

public class Question16 {

	public static void main(String[] args) {

		//               0    1    2    3    4
		char[] wolf = { 'W', 'e', 'b', 'b', 'y' };

		int q = wolf.length; //5
		for (;;) {
			System.out.print(wolf[--q]);
			if (q == 0)
				break;
		}
		
		System.out.println("********");
		
		for(int m=wolf.length-1; m>=0; --m)
			System.out.print(wolf[m]);
		
		System.out.println("********");

//		for(int z=0; z<wolf.length; z++)
//
//			System.out.print(wolf[wolf.length-z]);
		
		int x = wolf.length-1; //4

		for(int j=0; x>=0 && j==0; x--)

		System.out.print(wolf[x]);
		
		System.out.println("********");
		
//		final int r = wolf.length; //5
//
//		for(int w = r-1; r>-1; w = r-1)
//			//       4    
//
//		System.out.print(wolf[w]);
		
		for(int i=wolf.length; i>0; --i)

			System.out.print(wolf[i]);
	}

}
