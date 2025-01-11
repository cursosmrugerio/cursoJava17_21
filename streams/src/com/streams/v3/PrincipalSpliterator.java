package com.streams.v3;

import java.util.List;
import java.util.Spliterator;
import java.util.stream.Stream;

public class PrincipalSpliterator {

	public static void main(String[] args) {

		List<String> list = List.of("bird-", "bunny-", "cat-", "dog-", "fish-", "lamb-", "mouse-");
	
		Spliterator<String> originalBagOfFood = list.spliterator();
		
		Spliterator<String> emmasBag = originalBagOfFood.trySplit();
		
		System.out.println("**emmasBag**");
		
		//"bird-", "bunny-", "cat-"
		emmasBag.forEachRemaining(System.out::print);
		
		//originalBagOfFood.trySplit();
		//"dog-", "fish-", "lamb-", "mouse-"
	                    
		System.out.println();
		System.out.println("**jillsBag**");
		
		//"dog-", "fish-"
		Spliterator<String> jillsBag = originalBagOfFood.trySplit();
		jillsBag.tryAdvance(System.out::println); //dog-
		jillsBag.forEachRemaining(System.out::println); //fish-
		
		//originalBagOfFood.trySplit();
		//"lamb-", "mouse-"
		
		System.out.println("**originalBagOfFood**");
		originalBagOfFood.forEachRemaining(System.out::print); // lamb-mouse-
	
	}

}
