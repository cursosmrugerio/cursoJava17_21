package chapter04;

public class Question21A {
	
	public static void main(String[] args) {
		StringBuilder puzzle = new StringBuilder("Java");
		
		String s = puzzle.substring(0);
		
		System.out.println(s.intern() == "Java");
		
		
	}

}
