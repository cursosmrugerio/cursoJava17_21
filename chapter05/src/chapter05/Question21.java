package chapter05;

public class Question21 {
	
	public static void main(String[] args) {
		System.out.println("Hello");
		new Question21().moo();
		//new Question21().moo(1,2,3);

	}

//	public void moo(int... i, double... j) {
//	}
	
	public void moo(int m, int... n) {
		return;
	}
	
	private void moo(int... x) {
		System.out.println("Entro moo(int... x)");
	}
	
	//public void moo(int a, int... b) {}
	
	public int moo(char ch) {return 0;}
	//public void moooo(int... z) {}
	
}
