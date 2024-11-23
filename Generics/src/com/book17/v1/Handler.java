package com.book17.v1;

class Robot{}

class Crate<T> {
	private T contents;

	public T lookInCrate() {
		return contents;
	}

	public void packCrate(T contents) {
		this.contents = contents;
	}
}

public class Handler {
	public static <Z> void prepare(Z z) {
		System.out.println("Preparing " + z);
	}

	public static <X> Crate<X> ship(X t) {
		System.out.println("Shipping " + t);
		return new Crate<X>();
	}
	
	public static void main(String[] args) {
		System.out.println("V1");
		Handler.<String>prepare("Patrobas");
		prepare(new StringBuilder("Epeneto"));
		
		Crate<Robot> crate = ship(new Robot());
		
		Robot rob = crate.lookInCrate();
	}
	
	
}

