package chapter06;

public class Rodent {
	public Rodent(Integer x) {}
	
	//static void ejecuta() throws Exception {}
	
	protected static Number chew() throws Exception {
		System.out.println("Rodent is chewing");
		return 1;
	}
}

class Beaver extends Rodent {
	
	//HIDDEN
	//static void ejecuta() throws RuntimeException {}
	
	public static Integer chew() throws RuntimeException {
		System.out.println("Beaver is chewing on wood");
		return 2;
	}
	
	Beaver(int x){
		super(x);
	}
	
}
