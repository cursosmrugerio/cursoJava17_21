package com.curso.v0;

public class TestCode{
   public static void main(String[] args) {
       try{
           hello();
       }
       catch(MyException me){
           System.out.println(me); //MyException("Exception from foo")
       }
       System.out.println("Fin de Programa"); 
   }
   
   static void hello() throws MyException{
       //int[] dear = new int[7];
	   int[] dear = null;
       dear[0] = 747; //<== Lanza la Exception //NullPointerException
       foo();
   }
   
   static void foo() throws MyException{
       throw new MyException("Exception from foo");
   }
}

class MyException extends Exception {
   public MyException(String msg){
       super(msg);
   }
}