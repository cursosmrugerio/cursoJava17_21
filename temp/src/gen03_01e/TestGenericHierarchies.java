package gen03_01e;

public class TestGenericHierarchies {
    public static void main(String[] args) {
        CardboardBox<Fruit> cardboardBox = new CardboardBox<>();

        Box<Fruit> fruitBox = new Box<>();

        fruitBox = cardboardBox;
    }
}
