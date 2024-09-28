package com.curso.comparators;

import java.util.Comparator;
import com.curso.Employee;

public class ComparatorEdad implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.age() - o2.age();
	}

}
