package com.curso.comparators;

import java.util.Comparator;
import com.curso.Employee;

public class ComparatorSueldo implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return (int)(o2.salary() - o1.salary());
	}

}
