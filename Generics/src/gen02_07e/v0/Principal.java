package gen02_07e.v0;

import java.util.List;

public class Principal {

	public static void main(String[] args) {

		List<Long> longList = List.of(12L, 1L, 45L, 12L, 89L, 123L, 876L);
		NumericalOperations<Long> numLong = new NumericalOperations(longList);
		System.out.println(numLong.getMax());
		System.out.println(numLong.sortNumbers());
		
		List<Double> doubleList = List.of(1222.0, 1.1, 45.2, 12.5, 89.3, 123.5, 876.67);
		NumericalOperations<Double> numDouble = new NumericalOperations(doubleList);
		System.out.println(numDouble.getMax());
		System.out.println(numDouble.sortNumbers());

		
	}

}
