package covariant.rule1.v3;

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
	A<? extends Number> execute() {
		return null;
	}
}

class Papa extends Abuelo {
	@Override
	A<? extends Integer> execute() {
		return null;
	}
}

class Hijo extends Papa {
	@Override
	A<Integer> execute() {
		return null;
	}
}

public class Principal {

	public static void main(String[] args) {
		
		A<Integer> data1 = new A<>(100);
		A<? extends Integer> data2 = data1;
		A<? extends Number> data3 = data2;
		
		System.out.println(data3.getT());

	}

}
