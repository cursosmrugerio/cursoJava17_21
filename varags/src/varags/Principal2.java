package varags;

import java.util.Arrays;

public class Principal2 {

	public static void main(String... args) {
		System.out.println("Hola");
		System.out.println(args); 
		System.out.println(Arrays.toString(args)); 
		
		ejecuta(1);
		ejecuta(2,"1");
		ejecuta(3,"1","3");
		ejecuta(4,"1","2","3","4");
	}
	
	static void ejecuta(int i, String... cadenas) {
		//System.out.println(cadenas[0]);
		System.out.println("****");
		for(String s : cadenas) {
			System.out.println(s);
		}
	}

}
