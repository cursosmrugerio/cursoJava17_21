package com.curso.v1;

import java.util.Arrays;
import java.util.Comparator;
import com.curso.Employee;

public class Principal3 {
	
	public static void main(String[] args) {
				
		Employee emp1 = new Employee("Patrobas", 20, 123.45);
		Employee emp2 = new Employee("Andronico", 30, 823.45);
		Employee emp3 = new Employee("Epeneto", 15, 723.45);
		Employee emp4 = new Employee("Filologo", 40, 223.45);
		Employee emp5 = new Employee("Tercio", 18, 93.45);
		
		Employee[] arrayEmp = {emp1,emp2,emp3,emp4,emp5};
		
		System.out.println("Comparator x Edad");

		Comparator<Employee> compEdad = new Comparator<>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.age() - o2.age();
			}			
		};
		Arrays.sort(arrayEmp, compEdad);
		
		for (Employee e :arrayEmp)
			System.out.println(e);
		
		System.out.println("Comparator x Sueldo");

		Comparator<Employee> compSueldo = new Comparator<>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return (int)(o2.salary() - o1.salary());
			}			
		};
		Arrays.sort(arrayEmp, compSueldo);
		
		for (Employee e :arrayEmp)
			System.out.println(e);
		
		System.out.println("Comparator x Nombre");		
		
		Arrays.sort(arrayEmp, new Comparator<>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.name().compareTo(o2.name());
			}			
		});
		
		for (Employee e :arrayEmp)
			System.out.println(e);

	}

}
