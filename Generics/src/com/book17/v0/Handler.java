package com.book17.v0;

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
	public static <T> void prepare(T t) {
		System.out.println("Preparing " + t);
	}

	public static <T> Crate<T> ship(T t) {
		System.out.println("Shipping " + t);
		return new Crate<T>();
	}
	
	public static void main(String[] args) {
		Handler.<String>prepare("Patrobas");
		Handler.prepare(new StringBuilder("Epeneto"));
		
		Crate<Robot> crate = Handler.ship(new Robot());
		
		Robot rob = crate.lookInCrate();
	}
	
	
}

