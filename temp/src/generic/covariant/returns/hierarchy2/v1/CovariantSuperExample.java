package generic.covariant.returns.hierarchy2.v1;

import java.util.ArrayList;
import java.util.List;

class SuperBase {
    public List<? super Integer> getList() {
        List<Number> list = new ArrayList<>();
        list.add(10);  // Integer
        list.add(20.5); // Double
        return list;
    }
}


class Base extends SuperBase{
	@Override
    public List<? super Number> getList() {
        List<Number> list = new ArrayList<>();
        list.add(10);  // Integer
        list.add(20.5); // Double
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
    	
    	SuperBase superbase = new SuperBase();
        List<? super Integer> superbaseList = superbase.getList();
        superbaseList.add(25); // Allowed
        //superbaseList.add(30.4); //Not Allowed
        System.out.println("SuperBase list: " + superbaseList);
    	
        Base base = new Base();
        List<? super Number> baseList = base.getList();
        baseList.add(25); // Allowed, Integer is a subtype of Number
        baseList.add(30.4);
        System.out.println("Base list: " + baseList);

        SubClass subClass = new SubClass();
        List<Number> subList = subClass.getList(); // Allowed, List<Number> is a subtype of List<? super Number>
        subList.add(40); // Allowed, Integer is a subtype of Number
        subList.add(30.4);
        System.out.println("SubClass list: " + subList);
    }
}
