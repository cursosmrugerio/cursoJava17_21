package chapter04;

public class Question08 {
	
	public static void main(String[] args) {
		
		System.out.println("Q08");
		var string = "12345"; 
		var builder = new StringBuilder("12345");
		
		System.out.println(builder.charAt(4));
		
		//builder.replace(2, 4, "6").charAt(3);
		//12345
		//1265 
		//System.out.println(builder.replace(2, 4, "6").charAt(3));
		
		//builder.replace(2, 5, "6").charAt(2);
		System.out.println(builder.replace(2, 100, "6")); //126
		
		//System.out.println(string.charAt(5));
		System.out.println("string.length(): "+string.length());
		
		
		System.out.println("***: "+string.replace("123", "1").charAt(2));
		//12345
		//145
		
	}

}
