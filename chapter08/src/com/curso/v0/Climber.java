package com.curso.v0;

//import java.util.function.BiPredicate;

@FunctionalInterface
interface Climb {
	boolean isTooHigh(int height, int limit);
	String toString();
}

public class Climber {

	public static void main(String[] args) {
		
		//BiPredicate<Integer,Integer> biClimb = (x,y) -> x*y > 100;
		Climb lambdaClimb = (x,y) -> x*y > 100;
		
		Climb lambdaClimb2 = (h,m) -> 
			new StringBuilder(h).append(m).isEmpty();

	}

}
