package chapter04;

public class Question16 {
	
	public static void main(String[] args) {
		var base = "ewe\nsheep\\t";
		
//		System.out.println(base.length()); //11
//		
//		System.out.println(base.indent(2).length()); //16
//		
//		System.out.println(base.translateEscapes().length()); //10
		
		int length = base.length(); 
		int indent = base.indent(2).length(); 
		int translate = base.translateEscapes().length();
		
		var formatted = "%s %s %s".formatted(length, indent, translate); 
		
		System.out.format(formatted);
		
	}

}
