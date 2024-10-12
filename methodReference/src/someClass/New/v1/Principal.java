package someClass.New.v1;

import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

//import java.util.function.BinaryOperator;


public class Principal {

	public static void main(String[] args) {

		Supplier<Person> sup = Person::new;
		// Lambda
		// () -> new Person();
		Person per1 = sup.get();
		System.out.println(per1);

		Function<Integer, Person> fun = Person::new;
		// Lambda
		// i -> new Person(i);
		Person per2 = fun.apply(100);
		System.out.println(per2);

		BiFunction<Integer,String,Person> biFun = Person::new; 
		System.out.println(biFun.apply(500,"Patrobas"));
		
		TriFunction<Integer,String,StringBuilder,Person> triFun = Person::new; 
		
		System.out.println(triFun.apply(1000,"Epeneto",new StringBuilder("XZC")));

		UnaryOperator<String> uos = String::new;
		
		System.out.println(uos.apply("JavaCertification21"));
		
		//BinaryOperator<String> bos = String::new;
		
	}

}
