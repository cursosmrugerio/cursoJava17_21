package chapter05;

import java.util.Arrays;

public class Question07 {

	public static void main(String[] args) {
		int i = new Question07()
				//.juggle(true,new boolean[]{true, true});
				.juggle(true,new boolean[2]);
		System.out.println(i);
	}

	public int juggle(boolean b, boolean... b2) {
		System.out.println(Arrays.toString(b2));
		return b2.length; 
	}
}
