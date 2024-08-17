package chapter06;

class Speedster {
	int numSpots; //50
}

public class Cheetah extends Speedster {
	int numSpots; //0

	public Cheetah(int numSpots) {
		// INSERT CODE HERE 
		// numSpots = numSpots;
		// numSpots = this.numSpots;
		// this.numSpots = numSpots;
		super.numSpots = numSpots;
	}

	public static void main(String[] args) {
		Speedster s = new Cheetah(50); 
		System.out.print(s.numSpots); //50
	}

}
