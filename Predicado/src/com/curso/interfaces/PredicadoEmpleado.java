package com.curso.interfaces;

import com.curso.Employee;

@FunctionalInterface
public interface PredicadoEmpleado {
	
	boolean probar(Employee e);
	
}
