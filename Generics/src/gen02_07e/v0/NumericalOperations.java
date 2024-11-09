package gen02_07e.v0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumericalOperations <N extends Number & Comparable<N>> {
	
	private List<N> listaNumbers;
	
	public NumericalOperations(List<N> listaNumbers) {
		this.listaNumbers = new ArrayList<>(listaNumbers);
	}
	
	public List<N> sortNumbers(){
		Collections.sort(listaNumbers);
		return listaNumbers;
	}
	
	public N getMax() {
		return Collections.max(listaNumbers);
	}

}
