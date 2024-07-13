package com.curso;

public class Question20A {

	public static void main(String[] args) {
		
		// height  humidity
        //   1
		//   2        12,11
		//   3        12,11
		//   4        12,11
		// ..... 
		//   11
		int height = 1;
		L1: while(height++ < 10) {
		    long humidity = 12;
		    L2: do {
		        if(humidity-- % 12 == 0) break L2;
		        int temperature = 30;
		        L3: for( ; ; ) {
		            temperature++;
		            if(temperature > 50) continue L2;
		        }
		    } while (humidity > 4);
		}
		System.out.println("height: "+height);
	}
}
