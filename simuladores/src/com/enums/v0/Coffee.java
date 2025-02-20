package com.enums.v0;

import java.util.Arrays;

enum Coffee {
    ESPRESSO("Very Strong"), MOCHA("Bold"), LATTE("Mild");

    public String strength;

    Coffee(String strength) {
        this.strength = strength;
    }
    

    @Override
    public String toString() {
    	return String.valueOf(strength);
    	//return String.valueOf(Coffee.ESPRESSO) ;
    	//                      Coffee.ESPRESSO vuelve a ejecutar toString();
    	//return "Very Strong";
    	//return Coffee.values()[0];
    }
    
    public static void main(String[] args) {
    	
//    	Coffee[] arrayCoffee = Coffee.values();
//    	System.out.println(Arrays.toString(arrayCoffee));
//    	
//    	Coffee c = Coffee.values()[0];
    	System.out.println("*******");
		System.out.println(Coffee.ESPRESSO);
    	
    	
	}
    
}
