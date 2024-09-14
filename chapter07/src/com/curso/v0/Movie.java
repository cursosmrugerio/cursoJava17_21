package com.curso.v0;

public class Movie {
	
    private int butter = 5;
    private Movie() {}
    
    //Inner class
    protected class Popcorn {
        private Popcorn() {}
        public static int butter = 10;
        
        public void startMovie() {
            System.out.println(butter);
        }
    }
    
    public static void main(String[] args) {
    	
        var movie = new Movie();
        
        System.out.println(movie.butter); //5
        
        System.out.println(movie.new Popcorn().butter ); //10
        
        Popcorn in = movie.new Popcorn();
        
        in.startMovie(); //10
    }
}
