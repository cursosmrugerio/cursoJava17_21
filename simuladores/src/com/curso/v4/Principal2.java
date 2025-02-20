package com.curso.v4;

class Transaction<T,S>{
	public Transaction(T t,S s) {
	}
}

public class Principal2 {
	public static void main(String[] args) {
		
		Transaction<Number,Integer> t1 = 
				new Transaction<>(1,2);
		
		Transaction<Number,String> t2 = 
				new Transaction<>(1,"2");
		
		Transaction<String,Long> tt0 = 
				new Transaction<>("A",0L);
		
		Transaction<Double,StringBuilder> tt1 = 
				new Transaction<>(8.0,new StringBuilder("A"));
		
		Transaction<Integer,Integer> tt2 = 
				new Transaction<>(0,1);
	}
}
