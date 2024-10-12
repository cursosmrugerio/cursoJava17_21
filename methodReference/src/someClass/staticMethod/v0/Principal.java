package someClass.staticMethod.v0;

import java.util.function.BiPredicate;
import java.util.function.UnaryOperator;

public class Principal {

	public static void main(String[] args) {
		
		boolean res;

		//DEFINICION
		BiPredicate<Integer,Integer> mayor10 = Numeros::sumaMayor10;
				//Lambda
				//(i1,i2) -> Numeros.sumaMayor10(i1, i2);
				
		res = mayor10.test(3, 5); //EJECUTA
		System.out.println("Resultado: "+res);
		
		UnaryOperator<String> uo = Util::hacerAdmirable;
				//Lambda
				//z -> Util.hacerAdmirable(z);
				
		String cadena = uo.apply("Java Functional");
		
		System.out.println("Resultado cadena: "+ cadena);
		
		
	}

}
