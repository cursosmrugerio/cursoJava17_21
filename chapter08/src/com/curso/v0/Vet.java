package com.curso.v0;

import java.util.List;

interface Yawn {
	String yawn(double d, List<Integer> time);
}

class Sloth implements Yawn {
	public String yawn(double zzz, List<Integer> time) {
		return "Sleep: " + zzz;
	}
}

public class Vet {

	public static String takeNap(Yawn y) {
		return y.yawn(10, null);
	}

	public static void main(String... unused) {

		System.out.print(takeNap(          
				//new Sloth()  
				//(z,f) -> { String x = ""; return "Sleep: " + z; }
				//(t,s) -> { String t = ""; return "Sleep: " + t; }
				//(w,q) -> {return "Sleep: " + w;}
				//(e,u) -> { String g = ""; return "Sleep: " + e; }
				(a,b) -> "Sleep: " + (double)(b==null ? a : a)
				//(r,k) -> { String g = ""; return "Sleep: "+r; }
		));
	}
}









