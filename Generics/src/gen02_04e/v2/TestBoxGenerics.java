package gen02_04e.v2;

public class TestBoxGenerics {
    public static void main(String[] args) {
        Box<Book> bookBox = new Box<>();
        bookBox.addItem(new Book("Harry Potter & the half blood price", "JK Rowling", 0.5));
        bookBox.addItem(new Book("Deep Work", "Cal Newport", 0.25));
        System.out.println(bookBox.getLatestItem());
        System.out.println(bookBox);

        Box<Fruit> fruitBox = new Box<>();
        fruitBox.addItem(new Fruit("Mango", "India", "Yellow", 0.5));
        fruitBox.addItem(new Fruit("Banana", "Brazil", "Green", 0.3));
        System.out.println(fruitBox.getLatestItem());
        System.out.println(fruitBox);
        
        System.out.println("************");
        
        System.out.println("Book count: "+bookBox.getCountOfItems());
        System.out.println("Fruit count: "+fruitBox.getCountOfItems());
    }
}
