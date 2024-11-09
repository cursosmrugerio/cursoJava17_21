package covariant.v0;

class A {
	Number execute() {
		return null;
	}
}

class B extends A {
	@Override
	Integer execute() {
		return 10;
	}
}

public class Principal {
	
	public static void main(String[] args) {
		B b = new B();
		Integer i = b.execute();
		System.out.println(i);
	}
	
	
	

}
