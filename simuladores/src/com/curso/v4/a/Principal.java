package com.curso.v4.a;

class Transaction<T,S extends T>{
	public Transaction(T t,S s) {
	}
}

public class Principal {
	public static void main(String[] args) {
		
		Transaction<Number,Integer> t1 = 
				new Transaction<>(1,2);
		
//		Transaction<Number,String> t2 = 
//				new Transaction<>(1,"2");
		
		Transaction<Number,Long> tt0 = 
				new Transaction<>(1,0L);
		
		Transaction<CharSequence,StringBuilder> tt1 = 
				new Transaction<>("",new StringBuilder("A"));
		
		Transaction<Integer,Integer> tt2 = 
				new Transaction<>(0,1);
	}
}
