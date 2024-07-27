package chapter04;

import java.util.Arrays;

public class Question15 {

	public static void main(String[] args) {

		var arr = new String[] {"PIG", "pig", "123"};
		//123, PIG, pig
		
		Arrays.sort(arr); 
		System.out.println(Arrays.toString(arr)); 
		//System.out.println(Arrays.binarySearch(arr,"pig")); 
		System.out.println(Arrays.binarySearch(arr, "Pippa"));
	}

}
