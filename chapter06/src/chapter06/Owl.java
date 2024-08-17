package chapter06;

abstract class Nocturnal { 
	abstract boolean isBlind();
}
public class Owl extends Nocturnal{
	@Override
	public boolean isBlind() { return false; }
	
	public static void main(String[] args) {
		var nocturnal = (Nocturnal)new Owl(); 
				
		System.out.println(nocturnal.isBlind());
	}

}
