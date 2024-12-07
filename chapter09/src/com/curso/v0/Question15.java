package com.curso.v0;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Question15 {

	public static void main(String[] args) {
		
		var q = new LinkedList<>();
		q.add(10); //0
		q.add("Pato"); //1
		q.add(12); //2
		q.remove(2);
		System.out.print(q); //10
	}

}
