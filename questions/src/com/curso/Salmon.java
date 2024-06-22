package com.curso;

public class Salmon {
    
    
    public Salmon() {
        count = 4;
        System.out.print(2+"-");
    }
    
    int count; //4

    { System.out.print(count+"-"); } 

    
    public static void main(String[] args) {
    	System.out.print(7+"-");
        var s = new Salmon();
        System.out.print(s.count+"-");
    }
    
    { count++; } 
    
    static { System.out.println("999");}
}

//999
//7-0-2-4-
