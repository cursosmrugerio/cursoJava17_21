package covariant.rule1.v2;

class A<T> {
	private T t;

	public A(T t) {
		this.t = t;
	}

	public T getT() {
		return t;
	}
}

class Abuelo {
	A<? extends CharSequence> execute() {
		return null;
	}
}

class Papa extends Abuelo {
	@Override
	A<? extends String> execute() {
		return null;
	}
}

class Hijo extends Papa {
	@Override
	A<String> execute() {
		return null;
	}
}

public class Principal {

	public static void main(String[] args) {
		
		A<String> data1 = new A<>("Hello");
		A<? extends String> data2 = data1;
		A<? extends CharSequence> data3 = data2;
		
		System.out.println(data3.getT());

	}

}
