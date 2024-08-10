package chapter05;

public class Run {

	static void execute() {
		System.out.print("1-");
	}

//	static void execute(int num) {
//		System.out.print("2-");
//	}

//	static void execute(Integer num) {
//		System.out.print("3-");
//	}

//	static void execute(Object num) {
//		System.out.print("4-");
//	}

	static void execute(int... nums) {
		System.out.print("5-");
	}
	
//	static void execute(double... nums) {
//		System.out.print("6-");
//	}
//	
//	static void execute(byte... nums) {
//		System.out.print("7-");
//	}
	
//	static void execute(Object... nums) {
//		System.out.print("8-");
//	}

	public static void main(String[] args) {
		
		//Run.execute();

		Run.execute(100);

		//Run.execute(100L);
	}

}
