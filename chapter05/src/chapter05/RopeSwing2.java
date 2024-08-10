package chapter05;

//QUESTION 14
public class RopeSwing2 {
    private static final String leftRope;
    private static final String rightRope;
    private static final String bench; 
    private static final String name = "name";

    static {
        leftRope = "left";
        rightRope = "right";
    }

    static {
    	bench = "bench";
    }

    public static void main(String[] args) {
        System.out.println(bench);
    }
}
