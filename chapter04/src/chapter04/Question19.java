package chapter04;

import static java.util.Arrays.*;

public class Question19 {

	public static void main(String[] args) {

		String[] s1 = { "Camel", "Peacock", "Llama"};

		String[] s2 = { "Camel", "Llama", "Peacock"};

		String[] s3 = { "Camel"};

		String[] s4 = { "Camel", null};
		
		System.out.println(compare(s1, s2)); //POSITIVE
		
		System.out.println(compare(s3, s4)); //NEGATIVE
		
		System.out.println(compare(s4, s4)); //ZERO
		
		System.out.println(mismatch(s1, s2)); //1
		
		System.out.println(mismatch(s4, s4)); //-1
		
		System.out.println(mismatch(s3, s4)); //1
	}

}
