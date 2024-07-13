package com.curso;

public class Question20B {

	public static void main(String[] args) {
		
		// height  humidity  temperature
        //   1
        //   2        12
		//            11,10      30,31..50
		//            9          30,31..50  
		
		
		int height = 1;
		L1: while(height++ < 10) {
		    long humidity = 12;
		    L2: do {
		        if(humidity-- % 12 == 0) continue;
		        int temperature = 30;
		        L3: for( ; ; ) {
		            temperature++;
		            if(temperature > 50) continue;
		        }
		    } while (humidity > 4);
		}
		System.out.println("height: "+height);
	}
}
