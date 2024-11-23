package com.book17.v0;

public class TrickyCrate<T> {
	
	public <T> T tricky(T t) { 
		return t; 
	}
	
	public static void main(String[] args) {
		TrickyCrate<Integer> tc = new TrickyCrate<>();
		
		StringBuilder sb = 
				tc.tricky(new StringBuilder("Epeneto"));
		
		System.out.println(sb);
	}

}
