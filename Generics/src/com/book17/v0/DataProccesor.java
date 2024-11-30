package com.book17.v0;

import java.util.*;

public class DataProccesor {
	
	// Use ? extends when you only need to read
    public static void printAll(List<? extends Object> items) {
        items.forEach(System.out::println);
    }
    
    // Use T extends when you need type relationships
    public static <T extends Comparable<T>> void sortAndPrint(List<T> items) {
        Collections.sort(items);
        items.forEach(System.out::println);
    }
    
    // Use T extends when you need to maintain type safety across parameters
    public static <T extends Number> void validateAndCopy(List<T> source, 
                                                        List<T> target, 
                                                        T threshold) {
        for (T item : source) {
            if (item.doubleValue() > threshold.doubleValue()) {
                target.add(item);
            }
        }
    }
    
    public static void main(String[] args) {
    	
    	// Usage:
    	List<Integer> nums = Arrays.asList(1, 2, 3);
    	List<String> strings = Arrays.asList("a", "b", "c");
    	List<Integer> filteredNums = new ArrayList<>();
    	
    	List<Long> numsLong = Arrays.asList(1L, 2L, 3L);
    	List<Long> filteredNumsLong = new ArrayList<>();
    	
    	printAll(nums);
    	printAll(strings);
    	
    	sortAndPrint(nums);
    	sortAndPrint(strings);
    	
    	validateAndCopy(nums,filteredNums,2);
    	
    	validateAndCopy(numsLong,filteredNumsLong,2L);
		
	}

}
