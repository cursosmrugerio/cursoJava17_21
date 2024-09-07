package chapter06;

class Canine {
	public Canine(boolean t) {
		logger.append("a");
	}

	public Canine() { //<== 4
		logger.append("q");
	}

	private StringBuilder logger = new StringBuilder(); //qpzj

	protected void print(String v) {
		logger.append(v);
	}

	protected String view() {
		return logger.toString();
	}
}

class Fox extends Canine {
	public Fox(long x) { //<== 3
		print("p");
	}

	public Fox(String name) { //<== 2
		this(2);
		print("z");
	}
}

public class Fennec extends Fox {
	public Fennec(int e) { //<== 1
		super("tails");
		print("j");
	}

	public Fennec(short f) {
		super("eevee");
		print("m");
	}

	public static void main(String... unused) {
		System.out.println(new Fennec(1).view()); //qpzj
		//System.out.println(new Fennec(100).logger); //qpzj
	}
}
