package chapter05;

public class Order3 {
	
	final String value1 = "red"; 
	static String value2 = "blue";
	String value3 = "yellow";
	
	{
		//System.out.println("intancia");
		value2 = "purple";
		value3 = "orange";
	}
	
	static {
		//System.out.println("static");
		value2 = "cyan";
		//value3 = "turquoise";
	}
	
	public static void main(String[] args) {
//		new Order3();
		new Order3();
		System.out.println("Hello"); //static instancia instancia Hello
		System.out.println(value2); //purple
	}
}
