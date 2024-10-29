package com.linkedin.generics;

//public class TestWildcards extends Box<?>{
public class TestWildcards{
    public static void main(String[] args) {
       // new Box<?>();

      // var box = BoxUtils.<?>emptyBox();

        Box<Book> bookBox = new Box<>();
        bookBox.addItem(new Book("Harry Potter & the half blood price", "JK Rowling", 0.5));
        bookBox.addItem(new Book("Deep Work", "Cal Newport", 0.25));
        //unbounded wildcards
        System.out.println("Count of books: "+BoxUtils.getCountOfItems(bookBox));
        //upper bounded wildcards
        Box<Fruit> fruitBox = new Box<>();
        fruitBox.addItem(new Fruit("Mango", "India", "Yellow", 0.5));
        fruitBox.addItem(new Fruit("Banana", "Brazil", "Green", 0.3));
        System.out.println("Average weight of fruit: "+Box.getAverageWeightOfFruit(fruitBox));
        Box<Apple> appleBox = new Box<>();
        Box.getAverageWeightOfFruit(appleBox);
        Box<Boxable> boxableBox = new Box<>();
        //Box.getAverageWeightOfFruit(boxableBox);
        //Box.getAverageWeightOfFruit(bookBox);
        //lower bounded wildcards
        Box.addAppleToBox(appleBox);
        Box.addAppleToBox(fruitBox);
        Box.addAppleToBox(boxableBox);
        //Box.addAppleToBox(bookBox);




    }
}
