package com.curso.v0;

import com.curso.Employee;
import java.util.function.Predicate;

public class Principal8 {
	
	public static void main(String[] args) {
		
		System.out.println("V8");
				
		Employee emp1 = new Employee("Patrobas", 17, 123.45);
		Employee emp2 = new Employee("Andronico", 30, 823.45);
		Employee emp3 = new Employee("Epeneto", 15, 723.45);
		Employee emp4 = new Employee("Filologo", 40, 223.45);
		Employee emp5 = new Employee("Tercio", 18, 93.45);
		
		Employee[] arrayEmp = {emp1,emp2,emp3,emp4,emp5};
		
		Predicate<Employee> pe = e -> e.age()>=18;
		System.out.println("*** Es mayor de edad");
		
		showMayorEdad(arrayEmp, pe);
		
		Predicate<String> ps = x -> x.endsWith("o");
		System.out.println("*** Nombre termina con letra o");
		
		showName(arrayEmp, ps);
				
	}
	
	private static void showName(Employee[] arrayEmp, 
								 Predicate<String> ps) {
		for (Employee e :arrayEmp)
			if (ps.test(e.name()))
				System.out.println(e);
	}

	static void showMayorEdad(Employee[] arrayEmp, 
								 Predicate<Employee> pe) {
		for (Employee e :arrayEmp)
			if (pe.test(e)) //<== EJECUTANDO LA LAMBDA
				System.out.println(e);
	}

}
