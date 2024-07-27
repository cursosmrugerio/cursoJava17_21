package chapter04;

import java.util.Arrays;

public class Question09 {

	public static void main(String[] args) {

		int[] arr1 = {1,2,3};
		int[] arr2 = {1,2,3};
		
		//arrayEnteros[1] = 9; //Arrays son Mutables.
		//System.out.println(Arrays.toString(arr1));
		
		System.out.println(arr1==arr2); //false
		System.out.println(arr1.equals(arr2)); //false
		
		
	}

}
