package gen02_05e;

public class TestBoxGenerics {
    public static void main(String[] args) {
        Box<Book> bookBox = new Box<>();
        bookBox.addItem(new Book("Harry Potter & the half blood price", "JK Rowling", 0.5));
        bookBox.addItem(new Book("Deep Work", "Cal Newport", 0.25));
        System.out.println(bookBox.getLatestItem());
        System.out.println(bookBox);
        System.out.println("Book count: "+BoxUtils.getCountOfItems(bookBox));
        System.out.println("Total weight of book box: "+bookBox.getTotalWeight());

        Box<Fruit> fruitBox = new Box<>();
        fruitBox.addItem(new Fruit("Mango", "India", "Yellow", 0.5));
        fruitBox.addItem(new Fruit("Banana", "Brazil", "Green", 0.3));
        System.out.println(fruitBox.getLatestItem());
        System.out.println(fruitBox);
        System.out.println("Fruit count: "+BoxUtils.getCountOfItems(fruitBox));
        System.out.println("Total weight of fruit box: "+fruitBox.getTotalWeight());
        
//        Box<Double> doubleBox = new Box<>();
//        doubleBox.addItem(7.8);
//        doubleBox.addItem(5.8);
//        doubleBox.addItem(4.8);
//
//        System.out.println(doubleBox.getLatestItem());
//        System.out.println(doubleBox);
//        System.out.println("Double count: "+BoxUtils.getCountOfItems(doubleBox));

    }
}
