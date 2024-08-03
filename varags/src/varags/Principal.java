package varags;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Hello");
		System.out.println(args); 
		System.out.println(Arrays.toString(args)); 
		
		//ejecuta();
		ejecuta(new String[]{"1","2","3"});

	}
	
	static void ejecuta(String[] cadenas) {
		for(String s : cadenas) {
			System.out.println(s);
		}
	}

}
