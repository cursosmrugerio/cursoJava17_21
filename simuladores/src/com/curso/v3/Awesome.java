package com.curso.v3;

interface AmazingInterface{
    String value = "amazing"; //public static final
    void amazingMethod(String arg); //public abstract
}

abstract class AmazingClass implements AmazingInterface{
    static String value = "awesome";
    abstract void amazingMethod(String arg1, String arg2);
}

public class Awesome extends AmazingClass implements AmazingInterface {
    public void amazingMethod(String arg1){ }
    public void amazingMethod(String arg1, String arg2){ }
    
    public static void main(String[] args){
        AmazingInterface ai = new Awesome();
        
        //ai.amazingMethod(value);
        //((AmazingClass)ai).amazingMethod("x1", value); //<======
        //System.out.println(value); 
        //((AmazingClass)ai).amazingMethod(AmazingInterface.value, AmazingClass.value);
        ai.amazingMethod(AmazingInterface.value); 
    }
}