package com.streams.v0;

import java.util.*;

public class Principal {
	
    public static void main(String[] args) {
    	//CLASE LOCAL
        class Book {
            private String title;
            private String genre;

            public Book(String title, String genre) {
                this.title = title;
                this.genre = genre;
            }
            public String getTitle() {
            	return title;
            }
            public String getGenre() {
                return genre;
            }
			@Override
			public String toString() {
				return "Book [title=" + title + ", genre=" + genre + "]";
			}
        }

        List<Book> books = Arrays.asList(
            new Book("Gone with the wind", "Fiction"),
            new Book("Bourne Ultimatum", "Thriller"),
            new Book("The Client", "Thriller")
        );
        
        //System.out.println(books.getClass().getName());
        //java.util.Arrays$ArrayList 
        
        //books.add(new Book("Thinking in Java", "Fiction"));
        //books.remove(0);
        books.set(0, new Book("Thinking in Java", "Fiction"));
        books.get(0).title = "Gone with the wind";
        
        //books.forEach(System.out::println);

        List<String> genreList = new ArrayList<>();

        // Extract genres
//        for (Book book : books) {
//            genreList.add(book.getGenre());
//        }
        
        System.out.println(genreList);
    }
}

