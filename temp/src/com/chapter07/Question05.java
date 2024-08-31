package com.chapter07;

public class Question05 {
	
	interface HasExoskeleton {
	    double size = 2.0f;
	    abstract int getNumberOfSections();
	}

	abstract class Insect implements HasExoskeleton {
	    abstract int getNumberOfLegs();
	}

	public class Beetle extends Insect {
	    int getNumberOfLegs() { 
	        return 6; 
	    }

	    public int getNumberOfSections() { 
	        return 1; 
	    }
	}


}
