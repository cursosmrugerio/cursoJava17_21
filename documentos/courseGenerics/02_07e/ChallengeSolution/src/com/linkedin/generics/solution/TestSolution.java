package com.linkedin.generics.solution;


import java.util.List;

public class TestSolution {
    public static void main(String[] args) {
        List<Long> longList = List.of(12L, 1L, 45L, 12L, 89L, 123L, 876L);
        NumericalOperations<Long> numericalOperations = new NumericalOperations<>(longList);
        System.out.println(numericalOperations.sortNumbers());
        System.out.println(numericalOperations.getMax());
    }
}
