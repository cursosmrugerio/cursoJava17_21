package someClass.instanceMet.v0;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;


public class Principal2 {
	
	public static void main(String[] args) {
		Principal2 principal = new Principal2();
		
		BiFunction<Principal2,String,Integer> bifunc = Principal2::getCountLetters;
				//lambda
				//(p,s) -> p.getCountLetters(s);
				
		int count = bifunc.apply(principal,"HelloPython");
		
		System.out.println("Count: "+count);
		
		TriPredicate<Principal2,Integer,Integer> tp = Principal2::mayor10;
		
		System.out.println(tp.test(principal , 8, 5));
		
		
	}
	
	
	int getCountLetters(String s) {
		return s.length();
	}
	
	boolean mayor10(int x, int y) {
		return x+y > 10;
	}

}
