package com.curso.v3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Principal {

	static public record Employee(String name, int age, double salary) 
				implements Comparable<Employee> {
		@Override
		public int compareTo(Employee o) {
			return name.compareTo(o.name);
		}
	}

	public static void main(String[] args) {

		Employee emp1 = new Employee("Patrobas", 20, 123.45);
		Employee emp2 = new Employee("Andronico", 40, 823.45);
		Employee emp3 = new Employee("Epeneto", 15, 723.45);
		Employee emp4 = new Employee("Filologo", 40, 223.45);
		Employee emp5 = new Employee("Tercio", 18, 93.45);

		Employee[] arrayEmp = { emp1, emp2, emp3, emp4, emp5 };

		List<Employee> listaEmp = Arrays.asList(arrayEmp);

		Comparator<Employee> comparator = Comparator.naturalOrder();

		Collections.sort(listaEmp, comparator);

		for (Employee e : arrayEmp)
			System.out.println(e);

	}

}
