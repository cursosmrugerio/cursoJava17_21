package someClass.staticMethod.v1;

import java.util.function.BiPredicate;
import java.util.function.UnaryOperator;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.DoubleFunction;
import java.util.function.Supplier;
import java.util.function.DoubleSupplier;



public class Principal {

	public static void main(String[] args) {
		
		boolean res;

		//DEFINICION
		BiPredicate<Integer,Integer> mayor10 = Numeros::sumaMayor10;
				//Lambda
				//(i1,i2) -> Numeros.sumaMayor10(i1, i2);
				
		res = mayor10.test(3, 5); //EJECUTA
		System.out.println("Resultado BiPredicate: "+res);
		
		Function<Double,Boolean> funMayor10 = Numeros::sumaMayor10;
				//Lambda
				//d -> Numeros.sumaMayor10(d);
				
		res = funMayor10.apply(8.0); //EJECUTA
		System.out.println("Resultado Function: "+res);
		
		Predicate<Double> preMayor10 = Numeros::sumaMayor10;
		System.out.println("Resultado Predicate: "+preMayor10.test(9.0));


		System.out.println("***************");
		
		UnaryOperator<String> uo = Util::hacerAdmirable;
				//Lambda
				//z -> Util.hacerAdmirable(z);
				
		String cadena = uo.apply("Java Functional");
		
		System.out.println("Resultado cadena: "+ cadena);
		
		DoubleFunction<String> df = Util::hacerAdmirable;
		//DoubleFunction<String> df = d -> Util.hacerAdmirable(d);
		
		System.out.println("Resultado cadena: "+ df.apply(10.0));
		
		System.out.println("***************");

		BinaryOperator<String> bo = Principal::concatenar;
		System.out.println(bo.apply("Hello ", "World"));
		
		System.out.println("***************");

		Supplier<Double> sup = Math::random;
		System.out.println(sup.get());
		
		DoubleSupplier dsup = Math::random;
		System.out.println(dsup.getAsDouble());

		
	}
	
	static String concatenar(String s1, String s2) {
		return s1 + s2;
	}

}
