package gen03_02e;

public class TestGenericHierarchies {
    public static void main(String[] args) {
        CardboardBox<Fruit> cardboardBox = new CardboardBox<>();
        Box<Fruit> fruitBox = new Box<>();
        fruitBox = cardboardBox;

        //type argument hierarchies
        Box<Apple> appleBox = new Box<>();
        //fruitBox = appleBox;
    }
}
