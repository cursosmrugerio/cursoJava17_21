package com.curso.v2;

import com.curso.Employee;
import com.curso.interfaces.v2.Predicado;

public class Principal {
	
	public static void main(String[] args) {
		
		System.out.println("Version default");
						
		Employee emp1 = new Employee("Patrobas", 17, 123.45);
		Employee emp2 = new Employee("Andronico", 30, 823.45);
		Employee emp3 = new Employee("Epeneto", 15, 723.45);
		Employee emp4 = new Employee("Filologo", 40, 223.45);
		Employee emp5 = new Employee("Tercio", 18, 593.45);
		
		Employee[] arrayEmp = {emp1,emp2,emp3,emp4,emp5};
		
		Predicado<Employee> pe = e -> e.age()>=18;
		
		Predicado<Employee> peNeg = pe.negate();
		
		show(arrayEmp, peNeg);
		
		System.out.println("***************");

		show(arrayEmp, pe.negate());
		
		System.out.println("***************");
		
		System.out.println("Show mayores de 18 años && sueldo > 500");

		Predicado<Employee> peSueldoMayor500 = e -> e.salary()>500;
		
		Predicado<Employee> peEdadAndSueldo = pe.and(peSueldoMayor500);
		
		show(arrayEmp, peEdadAndSueldo);
		
		System.out.println("***************");

		show(arrayEmp, pe.and(e -> e.salary()>500));
		
		System.out.println("***************");
		
		System.out.println("Show mayores de 18 años || sueldo > 500");
		
		show(arrayEmp, pe.or(e -> e.salary()>500));


	}
	
	static void show(Employee[] arrayEmp, 
							  Predicado<Employee> pe) {
		
		for (Employee e :arrayEmp)
			if (pe.probar(e)) //<== EJECUTANDO LA LAMBDA
				System.out.println(e);
	}

}
