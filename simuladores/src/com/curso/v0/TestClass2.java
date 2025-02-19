package com.curso.v0;

interface I  { 
}

class A implements I{
	@Override
    public String toString(){ return "in a"; }
}

class B extends A{
	@Override
    public String toString(){ return "in b"; }
}

public class TestClass2 {
    public static void main(String[] args) {
        B b = new B();
        A a = b; //Upcast
        I i = a; //Upcast
        
       System.out.println(i.toString()); //in b
       System.out.println(((B)a).toString()); //in b
       System.out.println(a.toString()); //in b
       System.out.println(b.toString()); //in b
    }
}