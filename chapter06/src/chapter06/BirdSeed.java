package chapter06;

public class BirdSeed {
	private int numberBags; //0
	boolean call;

	public BirdSeed() { 
		this(2); // LINE 1
		call = false; 
		// LINE 2
	}

	public BirdSeed(int numberBags) {
		this.numberBags = numberBags;
	}

	public static void main(String[] args) {
		var seed = new BirdSeed();
		System.out.print(seed.numberBags); //2
	}
}