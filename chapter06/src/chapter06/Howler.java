package chapter06;

public class Howler {
    public Howler(long shadow) {
        //3
    }
    private Howler(int moon) {
        super();
    }
}

class Wolf extends Howler {
    protected Wolf(String stars) {
        super(2L);
    }
    public Wolf() {
    	//14
    	super(4);
    }
}

