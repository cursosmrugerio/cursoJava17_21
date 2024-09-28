package com.curso.comparators;

import java.util.Comparator;
import com.curso.Employee;

public class ComparatorNombre implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.name().compareTo(o2.name());
	}

}
