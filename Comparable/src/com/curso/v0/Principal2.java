package com.curso.v0;

import java.util.Arrays;

public class Principal2 {
	
	record Employee(String name, int age, double salary) implements Comparable<Employee> {

		@Override
		public int compareTo(Employee o) {
			if (this.age > o.age)
				return 88;
			else if (this.age < o.age)
				return -77;
			else
				return 0;
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("V2");
		
		Employee emp1 = new Employee("Patrobas", 20, 123.45);
		Employee emp2 = new Employee("Andronico", 30, 823.45);
		Employee emp3 = new Employee("Epeneto", 15, 723.45);
		Employee emp4 = new Employee("Filologo", 40, 223.45);
		Employee emp5 = new Employee("Tercio", 18, 93.45);
		
		Employee[] arrayEmp = {emp1,emp2,emp3,emp4,emp5};
		
		Arrays.sort(arrayEmp);
		
		for (Employee e :arrayEmp)
			System.out.println(e);

	}

}
