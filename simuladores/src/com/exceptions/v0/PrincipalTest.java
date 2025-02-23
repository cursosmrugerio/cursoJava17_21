package com.exceptions.v0;

public class PrincipalTest {
   public static void main(String args[]){
	   
      for(int i = 0; i< args.length; i++){
         System.out.println("  "+args[i]);
      }
      
      System.out.println("EndProgram");
   }
}

//Now consider the following 3 options for running the program:
//a: java Test
//b: java Test param1
//c: java Test param1 param2
//Which of the following statements are true?