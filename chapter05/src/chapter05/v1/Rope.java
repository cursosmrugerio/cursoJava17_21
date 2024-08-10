package chapter05.v1;

public class Rope {
	
	//int x;
	
    public static void swing() {
        System.out.print("swing");
    }

    public void climb() {
        System.out.println("climb");
    }

    public static void play() {
        swing();
        //climb();
        //System.out.println(x);
    }

    public static void main(String[] args) {
        Rope rope = new Rope();
        rope.play();
        Rope rope2 = null;
        System.out.print("-");
        rope2.play();
    }
}
