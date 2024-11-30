package com.book17.v0;

import java.util.*;

public class CollectionUtils {
	
	// Reading from source - use wildcard
    public static double sumAll(List<? extends Number> numbers) {
        return numbers.stream()
            .mapToDouble(Number::doubleValue)
            .sum();
    }
	
    // Writing to target - use wildcard
    public static void addToList(Number n, List<? super Number> list) {
        list.add(n);
    }
    
    // Both reading and writing - use T
    public static <T extends Number> void copyAndMultiply(List<T> source, 
                                                        List<T> target, 
                                                        int factor) {
        for (T number : source) {
            if (number instanceof Integer) {
                target.add((T) Integer.valueOf(number.intValue() * factor));
            }
        }
    }

}
