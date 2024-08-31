package com.chapter06;

//QUESTION 22
class Person {
    static String name;
    void setName(String q) { name = q; }
}

public class Child extends Person {
    static String name; //HIDDEN
    @Override
    void setName(String w) { name = w; }
    
    public static void main(String[] p) {
        final Child m = new Child();
        final Person t = m;
        
        m.name = "Elysia";
        t.name = "Sophia";
        
        System.out.println(Child.name);
        System.out.println(Person.name);
        
        System.out.println("*******");
        
        m.setName("Webby");
        t.setName("Olivia");
        
        System.out.println(Child.name);
        System.out.println(Person.name);
        
        System.out.println("*******");

        
        System.out.println(m.name + " " + t.name);
    }
}
