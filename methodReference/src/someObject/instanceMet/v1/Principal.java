package someObject.instanceMet.v1;

import java.util.function.BooleanSupplier;
import java.util.function.Predicate;


public class Principal {

	public static void main(String[] args) {
		
		String cadena = "";
		
		BooleanSupplier bs = cadena::isEmpty;
		
		System.out.println("BooleanSupplier: "+ bs.getAsBoolean());
		
		
		
		Predicate<String> pre = String::isEmpty;
		
		System.out.println("Predicate: "+pre.test(cadena));
		
		
	}

}

