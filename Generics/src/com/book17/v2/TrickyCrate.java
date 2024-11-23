package com.book17.v2;

public class TrickyCrate<T> {
	
	private T t;
	
	public TrickyCrate(T t) {
		this.t = t;
	}

	public <U> U tricky(U u) { 
		System.out.println(t);
		return u; 
	}
	
	public static void main(String[] args) {
		
		System.out.println("V2");
		
		TrickyCrate<Integer> tc = new TrickyCrate<>(100);
		
		StringBuilder sb = 
				tc.tricky(new StringBuilder("Epeneto"));
		
		System.out.println(sb);
	}

}
