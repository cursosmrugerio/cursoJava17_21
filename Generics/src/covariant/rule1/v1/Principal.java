package covariant.rule1.v1;

import java.util.*;

class Abuelo {
	List<? extends Number> execute() {
		return null;
	}
}

class Papa extends Abuelo {
	@Override
	List<? extends Long> execute() {
		return null;
	}
}

class Hijo extends Papa {
	@Override
	List<Long> execute() {
		return null;
	}
}


public class Principal {
	
	public static void main(String[] args) {
		
		List<Long> listaLong1 = List.of(1l,2l,3l,4l);
		List<? extends Long> listaLong2 = (List<? extends Long>)listaLong1;
		List<? extends Number> listaLong3 = (List<? extends Number>)listaLong2;
		
	}
	
}
