package chapter04;

public class Question04 {
	
	public static void main(String[] args) {
		
		var s = "Hello"; 
		var t = new String(s); 
		if (t.equals(s)) System.out.println("zero");
		if ("Hello".equals(s)) System.out.println("one"); //true 
		if (t == s) System.out.println("two"); 
		if (t.intern() == s) System.out.println("three");
		if (t == s) System.out.println("Other two"); 
		if ("Hello" == s) System.out.println("four"); 
		if ("Hello" == t.intern()) System.out.println("five");
		
		
		
	}

}
