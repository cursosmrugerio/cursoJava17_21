package com.curso.v0;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.function.UnaryOperator;

public class PrincipalFunction {

	public static void main(String[] args) {

		Function<String,Integer> fun1 = y -> y.length();
		int longitud = fun1.apply("Hello World Java");
		System.out.println("Function: "+longitud);
		
		ToIntFunction<String> fun4 = y -> y.length();
		longitud = fun4.applyAsInt("Hola Mundo Java");
		System.out.println("ToIntFunction: "+longitud);

		Function<Employee,String> fun2 = z -> z.name();
		String name = fun2.apply(new Employee("Patrobas",20,100.0));
		System.out.println(name);
		
		Function<String,String> fun3 = w -> w + " Mundo";
		String cadena = fun3.apply("Hola");
		System.out.println(cadena);
		
		UnaryOperator<String> uo1 = w -> w + " World";
		cadena = uo1.apply("Hello");
		System.out.println(cadena);
		
		System.out.println("*********");
		
		Empleado emp1 = new Empleado("Patrobas", 17, 123.45);
		Empleado emp2 = new Empleado("Andronico", 30, 823.45);
		Empleado emp3 = new Empleado("Epeneto", 15, 723.45);
		Empleado emp4 = new Empleado("Filologo", 40, 223.45);
		Empleado emp5 = new Empleado("Tercio", 18, 593.45);
		Empleado[] arrayEmp = {emp1,emp2,emp3,emp4,emp5};
		
		List<Empleado> listEmp = new ArrayList<>(Arrays.asList(arrayEmp));
		
		UnaryOperator<Empleado> uo2 = x -> {
			x.setSalary(x.getSalary()+100);
			return x;
		};
		listEmp.replaceAll(uo2);
		
		listEmp.replaceAll( x -> {
			x.setSalary(x.getSalary()+100);
			return x;
		} );
		
		listEmp.forEach(e -> System.out.println(e));
		
		System.out.println("********");
		
//		listEmp.add(new Empleado("Patrobas",20,100.0));
		
		listEmp.removeIf(t -> t.getAge()>=30); //Predicate
		
		listEmp.forEach(e -> System.out.println(e));



	}

}
