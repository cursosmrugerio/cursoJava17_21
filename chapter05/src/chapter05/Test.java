package chapter05;

public class Test {

	public void print(Object x) {
		System.out.print("Object-");
	}
	public void print(Number x) {
		System.out.print("Number-");
	}
//	public void print(Integer x) {
//		System.out.print("Integer-");
//	}
	public void print(Double x) {
		System.out.print("Double-");
	}
	public void print(int x) {
		System.out.print("int-");
	}
	
	public static void main(String[] args) {
		new Test().print(null);
	}

}
