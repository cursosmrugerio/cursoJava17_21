package com.curso.v0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

class Data {
	int value;

	Data(int value) {
		this.value = value;
	}

	public String toString() {
		return "" + value;
	}
}

public class Principal {

	public static void main(String[] args) {
		
		ArrayList<Data> al = new ArrayList<>();
		
		Data d = new Data(1);
		al.add(d);
		d = new Data(2);
		al.add(d);
		d = new Data(3);
		al.add(d);
		
		//Predicate<Data> pre = x -> x.value==2;
		//Predicate<Data> pre = x -> x.value%2==0;
		Predicate<Data> pre = (Data x) -> x.value%2==0;

		// INSERT METHOD CALL HERE
		new Principal().filterData(al,pre);
		
		System.out.println(al); //1,3
	}

	public void filterData(ArrayList<Data> dataList, Predicate<Data> p) {
		Iterator<Data> i = dataList.iterator();
		while (i.hasNext()) {
			if (p.test(i.next())) {
				i.remove();
			}
		}
	}

}
