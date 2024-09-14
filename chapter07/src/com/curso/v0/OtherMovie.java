package com.curso.v0;

public class OtherMovie {
	
    private int butter = 5;
    public OtherMovie() {}
    
    //Inner class
    protected class OtherPopcorn {
    	
        private OtherPopcorn() {} //CONSTRUCTOR
        
        public static int butter = 10;
        
        public void startMovie() {
            System.out.println(butter);
        }
    }
    
    public static void main(String[] args) {
    	
    	OtherMovie.OtherPopcorn o = new OtherMovie().new OtherPopcorn();
    	
    }

}
