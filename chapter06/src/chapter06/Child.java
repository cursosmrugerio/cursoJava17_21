package chapter06;

class Person {
    static String name;
    void setName(String q) { 
    	System.out.println("NUNCA PASO");
    	name = q; 
    }
}

public class Child extends Person {
    static String name;
    void setName(String w) { 
    	System.out.println("PASO");
    	name = w; 
    }

    public static void main(String[] p) {
        final Child m = new Child();
        final Person t = m;
        
        m.name = "Elysia"; 
        //Child.name = "Elysia"; 
        t.name = "Sophia";
        //Person.name = "Sophia";
        
        System.out.println(m.name); //Elysia
        System.out.println(t.name); //Sophia
        
        System.out.println("*******");
        
        m.setName("Webby");
        t.setName("Olivia");
        
        System.out.println(m.name); //Olivia
        System.out.println(t.name); //Sophia
        
        System.out.println(m.name + " " + t.name);
    }
}
