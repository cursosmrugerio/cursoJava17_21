package com.curso;

public class Question08A {

	public static void main(String[] args) {
		
		printTypeB(new Object());
		printTypeB("Hello");
		printTypeB(9);


	}
	
	//VERSION A PARTIR DE LA 16
	static void printTypeB(Object o) { 
		if(o instanceof Integer data) { 
			double d = data.doubleValue();
			System.out.println(d);
		}
		else if(o instanceof Integer data) { 
			System.out.println(data);
		}
	}
	
	//VERSION ANTES 16
	static void printTypeA(Object o) { 
		if(o instanceof Integer) { 
			double d = ((Integer)o).doubleValue();
			System.out.print(d);
		}
	}

}
