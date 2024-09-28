package com.curso.v1;

import java.util.Arrays;
import java.util.Comparator;
import com.curso.Employee;

public class Principal5 {
	
	public static void main(String[] args) {
		
		System.out.println("Lambdas");
				
		Employee emp1 = new Employee("Patrobas", 20, 123.45);
		Employee emp2 = new Employee("Andronico", 30, 823.45);
		Employee emp3 = new Employee("Epeneto", 15, 723.45);
		Employee emp4 = new Employee("Filologo", 40, 223.45);
		Employee emp5 = new Employee("Tercio", 18, 93.45);
		
		Employee[] arrayEmp = {emp1,emp2,emp3,emp4,emp5};
		
		System.out.println("Comparator x Edad");

		Comparator<Employee> compEdad = (Employee w, Employee z) -> {
			System.out.println(w);
			System.out.println(z);
			int i = w.age() - z.age();
			return i;
		};
		
		Arrays.sort(arrayEmp, compEdad);
		
		for (Employee e :arrayEmp)
			System.out.println(e);
		
		System.out.println("Comparator x Sueldo");

		Comparator<Employee> compSueldo = (empl1,empl2) -> ((int)(empl1.salary() - empl2.salary()));
		Arrays.sort(arrayEmp, compSueldo);
		
		for (Employee e :arrayEmp)
			System.out.println(e);
		
		System.out.println("Comparator x Nombre");		
		
		Arrays.sort(arrayEmp, (x,y) -> x.name().compareTo(y.name()));
		
		for (Employee e :arrayEmp)
			System.out.println(e);

	}

}
