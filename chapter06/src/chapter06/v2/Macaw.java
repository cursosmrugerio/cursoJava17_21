package chapter06.v2;

class Bird {
    int feathers = 0; //3
    Bird(int x) { this.feathers = x; }
    Bird fly() {
        return new Bird(1);
    }
}

class Parrot extends Bird {
    protected Parrot(int y) { super(y); }
    @Override
    protected Parrot fly() {
        return new Parrot(2);
    }
}

public class Macaw extends Parrot {
    public Macaw(int z) { super(z); }
    @Override
    public Macaw fly() {
        return new Macaw(3);
    }

    public static void main(String... sing) {
        Bird p = new Macaw(4);
        //System.out.println(p.feathers);
        
        Parrot otherMacaw = ((Parrot)p.fly());
        System.out.print(otherMacaw.feathers);
    }
}
