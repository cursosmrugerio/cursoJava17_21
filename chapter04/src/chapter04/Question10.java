package chapter04;

import java.util.Arrays;

public class Question10 {

	public static void main(String[] args) {
		int one = Math.min(5, 3); //3 
		System.out.println("one: "+one);
		long two = Math.round(5.5); //6
		System.out.println("two: "+two);
		double three = Math.floor(6.9999); //6.0
		System.out.println("three: "+three);
		var doubles = new double[] {one, two, three};
		
		System.out.println(Arrays.toString(doubles));
	}

}
