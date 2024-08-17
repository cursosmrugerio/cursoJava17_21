package chapter06;

abstract class Bird {
	private final void fly() {
		System.out.println("Bird");
	}

	protected Bird() {
		System.out.print("Wow-");
	}
}

public class Pelican extends Bird {
	public Pelican() {
		super();
		System.out.print("Oh-");
	}

	protected void fly() {
		System.out.println("Pelican");
	}

	public static void main(String[] args) {
		var chirp = new Pelican(); // Wow-Oh-
		chirp.fly(); // Pelican
	}
}
