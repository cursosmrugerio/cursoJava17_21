package com.streams.v0;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

public class Principal3 {

	public static void main(String[] args) {

		 List<Book> books1 = Arrays.asList(
		            new Book("Gone with the wind", "Fiction"),
		            new Book("Bourne Ultimatum", "Thriller"),
		            new Book("The Client", "Thriller")
		        );
		 List<Book> books2 = Arrays.asList(
		            new Book("JavaSript1", "Fiction"),
		            new Book("JavaSript2", "Thriller"),
		            new Book("JavaSript3", "Thriller")
		        );
		 List<Book> books3 = Arrays.asList(
		            new Book("Python1", "Fiction"),
		            new Book("Python2", "Thriller"),
		            new Book("Python3", "Thriller")
		        );
		 
		 Stream<List<Book>> streamListBook = Stream.of(books1,books2,books3);
		 
		 Stream<Book> streamBook = 
				 streamListBook.flatMap(l -> l.stream());
		 
		 //streamBook.forEach(b -> System.out.println(b));
		 
		 List<Book> listBooks =  streamBook.collect(Collectors.toList());
		 
		 listBooks.forEach(b -> System.out.println(b));
		 
		 
		 
		
	}

}
