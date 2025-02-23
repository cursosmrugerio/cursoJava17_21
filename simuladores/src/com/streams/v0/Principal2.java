package com.streams.v0;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Principal2 {
	
    public static void main(String[] args) {
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
        
        List<String> genreList = new ArrayList<>();
        
        Function<Book,String> fun1 = Book::getGenre;
        Function<Book,String> fun2 = b -> b.getGenre();
        
        
//        books.stream() //Stream<Book>
//        	.map(fun2) //Stream<String>
//        	.forEach(s->genreList.add(s)); //CORRECTA
        
//        genreList = books.stream()
//        		    .map(b -> b.getGenre()) //Stream<String>
//        		    .collect(Collectors.toList()); //CORRECTA
        
//        books.stream()
//        	.map(Book::getGenre)
//        	.collect(Collectors.toList(genreList)); //INCORRECTA
        
//        books.stream() //Stream<Book>
//        	.flatMap(b->b. getGenre())
//        	.forEach(g->genreList.add(g)); //INCORRECTA
        
        
        Function<Book,String> fun3 = Book::getGenre;
        Function<Book,String> fun4 = b -> b.getGenre();
        
        Consumer<String> con1 = genreList::add;
        Consumer<String> con2 = s -> genreList.add(s);
       
        books.stream()
        	.map(fun4) //fun3,fun4
        	.forEach(con2); //con1, con2
        
        System.out.println(genreList);
    }
}

