package com.book17.v1;

public class TrickyCrate<T> {
	
	private T t;
	
	public TrickyCrate(T t) {
		this.t = t;
	}

	public <T> T tricky(T t) { 
		System.out.println(this.t);
		return t; 
	}
	
	public static void main(String[] args) {
		TrickyCrate<Integer> tc = new TrickyCrate<>(100);
		
		StringBuilder sb = 
				tc.tricky(new StringBuilder("Epeneto"));
		
		System.out.println(sb);
	}

}
