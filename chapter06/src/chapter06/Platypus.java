package chapter06;

class Mammal {
	private void sneeze() {
	}

	public Mammal(int age) {
		System.out.print("Mammal");
	}
}

public class Platypus extends Mammal {
	private void sneeze() {	
	}

	public Platypus() {
		super(1);
		System.out.print("Platypus");
	}

	public static void main(String[] args) {
		new Mammal(5);
	}
}
