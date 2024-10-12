package someObject.instanceMet.v0;

import java.util.function.Function;
import java.util.function.BiPredicate;


public class Principal2 {
	
	public static void main(String[] args) {
		Principal2 principal = new Principal2();
		
		Function<String,Integer> func = principal::getCountLetters;
				//lambda
				//(s) -> principal.getCountLetters(s);
				
		int count = func.apply("HelloJava");
		
		System.out.println("Count: "+count);
		
		BiPredicate<Integer,Integer> bp = principal::mayor10;
		
		System.out.println(bp.test(8, 5));
		
		
	}
	
	
	int getCountLetters(String s) {
		return s.length();
	}
	
	boolean mayor10(int x, int y) {
		return x+y > 10;
	}

}
