package gen02_02e;

public class TestBoxGenerics {
    public static void main(String[] args) {
        Box<Book> bookBox = new Box<>();
        System.out.println(bookBox);

        Box<Fruit> fruitBox = new Box<>();
        System.out.println(fruitBox);
    }
}
