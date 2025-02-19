package com.curso.v1;

import java.util.ArrayList;
import java.util.List;

class A {
	//Upper Bounded Wildcard
	public List<? extends Number> getList(){
		return null;
	}
}

public class B extends A {
	
	public ArrayList<? extends Integer> getList(){ 
		return  null;
	}
	
//	@Override
//	public List<? extends Integer> getList(){
//		return null;
//	}
	
//	@Override
//	public List<? extends Number> getList(){
//		return null;
//	}
	
	
	public static void main(String[] args) {
		List<? extends Number> lista1 = new ArrayList<Number>(); //<==
		List<? extends Number> lista2 = new ArrayList<Double>();
		List<? extends Number> lista3 = new ArrayList<Integer>(); //<==
		
		List<? super Number> lista4 = new ArrayList<Number>();
		List<? super Number> lista5 = new ArrayList<Object>();
	}
	

}
