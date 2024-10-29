package com.linkedin.generics.solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumericalOperations<N extends Number & Comparable<N>> {
    //instance variable
    private List<N> operands;

    public NumericalOperations(List<N> operands){
        this.operands = new ArrayList<>(operands);
    }

    public List<N> sortNumbers(){
        Collections.sort(operands);
        return operands;
    }

    public N getMax(){
        return Collections.max(operands);
    }
}
