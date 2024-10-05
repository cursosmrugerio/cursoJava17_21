package com.curso.v0;

import java.util.function.Supplier;
import java.util.function.DoubleSupplier;

public class PrincipalSupplier {

	public static void main(String[] args) {

		Supplier<String> sup1 = () -> "Hello World Java";
		String greet = sup1.get();
		System.out.println(greet);
		
		Supplier<Employee> emp = () -> new Employee("Patrobas",20,100.0);
		Employee e = emp.get();
		System.out.println(e);
		
		Supplier<Double> random = () -> Math.random();
		System.out.println("Supplier: "+random.get());
		
		DoubleSupplier random2 = () -> Math.random();
		System.out.println("DoubleSupplier: "+random2.getAsDouble());

		
	}

}
