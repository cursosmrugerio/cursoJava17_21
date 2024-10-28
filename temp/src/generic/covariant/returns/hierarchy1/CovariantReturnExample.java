package generic.covariant.returns.hierarchy1;

class A<T> {
    private T value;

    public A(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}


public class CovariantReturnExample {

    public static void main(String[] args) {
        // Instance of A<Integer>
        A<Integer> intInstance = new A<>(123);

        // Instance of A<? extends Integer>
        A<? extends Integer> wildcardIntInstance = intInstance;

        // Instance of A<? extends Number>
        A<? extends Number> wildcardNumberInstance = wildcardIntInstance;

        // Print values to illustrate hierarchy
        System.out.println("Value from A<Integer>: " + intInstance.getValue());
        System.out.println("Value from A<? extends Integer>: " + wildcardIntInstance.getValue());
        System.out.println("Value from A<? extends Number>: " + wildcardNumberInstance.getValue());
    }
}

class Abuelo{
	A<? extends Number> ejecuta(){
		return null;
	}
}

class Padre extends Abuelo{
	@Override
	A<? extends Integer> ejecuta(){
		return null;
	}
}

class Hijo extends Padre{
	@Override
	A<Integer> ejecuta(){
		return null;
	}
}









