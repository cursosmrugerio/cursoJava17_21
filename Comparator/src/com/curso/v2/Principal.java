package com.curso.v2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import com.curso.Employee;

public class Principal {
	
	public static void main(String[] args) {
						
		Employee emp1 = new Employee("Patrobas", 20, 123.45);
		Employee emp2 = new Employee("Andronico", 40, 823.45);
		Employee emp3 = new Employee("Epeneto", 15, 723.45);
		Employee emp4 = new Employee("Filologo", 40, 223.45);
		Employee emp5 = new Employee("Tercio", 18, 93.45);
		
		Employee[] arrayEmp = {emp1,emp2,emp3,emp4,emp5};
		
		List<Employee> listaEmp = Arrays.asList(arrayEmp);
		
		Comparator<Employee> compEdad = Comparator
				.comparing(Employee::age)
				.thenComparing(Employee::name)
				.thenComparing(Employee::salary)
				.reversed();
		
		compEdad = Comparator
				.comparingInt(Employee::age)
				.thenComparing(Employee::name)
				.thenComparingDouble(Employee::salary)
				.reversed();
						
		Collections.sort(listaEmp, compEdad);
		
		for (Employee e :arrayEmp)
			System.out.println(e);
		
	

	}

}
