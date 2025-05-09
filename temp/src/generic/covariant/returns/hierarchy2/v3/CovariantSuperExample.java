package generic.covariant.returns.hierarchy2.v3;

import java.util.ArrayList;
import java.util.List;

class SuperBase {
    public List<? super Integer> getList() {
        List<Object> list = new ArrayList<>();
        list.add(10);  // Integer
        list.add(20.5); // Double
        list.add(new Object()); // Object
        list.add("Hello");
        return list;
    }
}

class Base extends SuperBase{
	@Override
    public List<? super Number> getList() {
        List<Object> list = new ArrayList<>();
        list.add(10);  // Integer
        list.add(20.5); // Double
        list.add(new Object()); // Object
        list.add("Hello");
        return list;
    }
}

class SubClass extends Base {
    @Override
    public List<Number> getList() {
        List<Number> list = new ArrayList<>();
        list.add(15);  // Integer
        list.add(30.5); // Double
        return list;
    }
}

public class CovariantSuperExample {

    public static void main(String[] args) {
    	
    	SubClass subClass = new SubClass();
        List<Number> subList = subClass.getList(); // Allowed, List<Number> is a subtype of List<? super Number>
        subList.add(40); // Allowed, Integer is a subtype of Number
        subList.add(30.4); // Allowed, Double is a subtype of Number
        System.out.println("SubClass list: " + subList);
        
        
        List<? super Number> baseList = subList;
        baseList.add(25); // Allowed, Integer is a subtype of Number
        baseList.add(30.4); // Allowed, Double is a subtype of Number
        //baseList.add(new Object()); //Not Allowed
        System.out.println("Base list: " + baseList);
    	
        List<? super Integer> superbaseList = baseList;
        superbaseList.add(25); // Allowed
        //superbaseList.add(30.4); //Not Allowed
        //superbaseList.add(new Object()); //Not Allowed
        System.out.println("SuperBase list: " + superbaseList);
        
        Base base = new Base();
        baseList = base.getList();
        baseList.add(25); // Allowed, Integer is a subtype of Number
        baseList.add(30.4); // Allowed, Double is a subtype of Number
        //baseList.add(new Object()); //Not Allowed
        
        SuperBase superbase = new SuperBase();
        superbaseList = superbase.getList();
        superbaseList.add(25); // Allowed
        //superbaseList.add(30.4); //Not Allowed
        //superbaseList.add(new Object()); //Not Allowed
    	
    }
}
