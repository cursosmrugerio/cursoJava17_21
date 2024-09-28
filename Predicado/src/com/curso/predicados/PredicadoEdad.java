package com.curso.predicados;

import com.curso.Employee;
import com.curso.interfaces.PredicadoEmpleado;

public class PredicadoEdad implements PredicadoEmpleado {

	@Override
	public boolean probar(Employee e) {
		return e.age()>=18;
	}

}
