package chapter04;

public class Question12 {

	public static void main(String[] args) {

		var numbers = "012345678";
		System.out.println(numbers);
		
		numbers = "012345678".indent(1);
		System.out.println(numbers);
		
		numbers = numbers.stripLeading();
		System.out.println(numbers);
		
		System.out.println(numbers.substring(1, 3));//12
		System.out.println(numbers.substring(7, 7));//nothing
		System.out.println(numbers.substring(7, 8));//7
		System.out.print(numbers.substring(7)); //78

	}

}
