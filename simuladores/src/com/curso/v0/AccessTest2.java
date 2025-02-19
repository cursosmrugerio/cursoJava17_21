package com.curso.v0;

public class AccessTest2 {
    static int number;
    int result = 10;
    
    public static void main(String[] args) {
        AccessTest2 at = new AccessTest2();
        int result = 11; //local
        number = result;
        //System.out.println(at.addSalt(this.result));
    }
    
    int addSalt(int salt){
        return number+salt;
    }
}