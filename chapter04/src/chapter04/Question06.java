package chapter04;

import java.util.Arrays;

public class Question06 {

	public static void main(String[] args) {

		double one = Math.pow(1, 2);
		
		System.out.println(one);
		
		long two = Math.round(1.0);
		
		double three = Math.random();
		
		var doubles = new double[] {one, two, three};
		
		System.out.println(Arrays.toString(doubles));
		
		double d1 = 89L;
		
		//long l1 = 5.5;
		
		
	}

}
