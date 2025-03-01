package com.curso.v0;

class Holder{
	   int value = 1; //HAS-A
	   Holder link; //HAS-A
	   
	   public Holder(int val){ this.value = val; }
	   
	   public static void main(String[] args){
	       final Holder a = new Holder(5);
	       Holder b = new Holder(10);
	       
	       a.link = b;
	       b.link = setIt(a, b);
	       //System.out.println(a.link.value+" "+b.link.value);
	       //System.out.println("a.link.value: "+a.link.value); //NullPointerException
	       System.out.println("b.link.value: "+b.link.value); //5
	   }
	   
	   public static Holder setIt(final Holder x, final Holder y){
	       x.link = y.link;
	       return x;
	   }
	}