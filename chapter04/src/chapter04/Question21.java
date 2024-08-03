package chapter04;

public class Question21 {
	
	public static void main(String[] args) {
		var puzzle = new StringBuilder("Java");
		//puzzle.reverse(); //CORRECTO
		//puzzle.append("vaJ$").substring(3,7); 
		//JavavaJ$
		
		//puzzle.append("vaJ$").delete(0, 3).deleteCharAt(puzzle.length() - 1);
		//JavavaJ$            avaJ$        avaJ       
		
		//puzzle.append("vaJ$").delete(0, 3).deleteCharAt(puzzle.length());
		
		System.out.println(puzzle);
		
		
		
		
	}

}
