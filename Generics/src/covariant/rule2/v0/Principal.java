package covariant.rule2.v0;

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
	A<? super Float> execute() {
		return null;
	}
}

class Papa extends Abuelo {
	@Override
	A<? super Number> execute() {
		return null;
	}
}

class Hijo extends Papa {
	@Override
	A<Number> execute() {
		return null;
	}
}

public class Principal {

	public static void main(String[] args) {
		
		A<Number> data1 = new A<>(100);
		A<? super Number> data2 = data1;
		A<? super Float> data3 = data2;
		
		System.out.println("Number: "+data3.getT());
		
		A<CharSequence> data4 = new A<>(new StringBuilder("OCP JAVA"));
		A<? super CharSequence> data5 = data4;
		A<? super StringBuilder> data6 = data5;
		
		System.out.println("CharSequence: "+data6.getT());

	}

}
