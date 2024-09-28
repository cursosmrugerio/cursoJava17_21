package com.curso.v0;

import java.util.Arrays;
import com.curso.Employee;
import com.curso.comparators.ComparatorEdad;

public class Principal {
	
	public static void main(String[] args) {
				
		System.out.println("Comparator Edad");
		
		Employee emp1 = new Employee("Patrobas", 20, 123.45);
		Employee emp2 = new Employee("Andronico", 30, 823.45);
		Employee emp3 = new Employee("Epeneto", 15, 723.45);
		Employee emp4 = new Employee("Filologo", 40, 223.45);
		Employee emp5 = new Employee("Tercio", 18, 93.45);
		
		Employee[] arrayEmp = {emp1,emp2,emp3,emp4,emp5};
		
		Arrays.sort(arrayEmp, new ComparatorEdad());
		
		for (Employee e :arrayEmp)
			System.out.println(e);

	}

}
