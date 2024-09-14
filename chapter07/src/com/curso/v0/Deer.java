package com.curso.v0;

public class Deer {
	enum Food {
		APPLES, BERRIES, GRASS
	}

	protected class Diet {
		private Food getFavorite() {
			return Food.BERRIES;
		}
	}

//	public static void main(String[] seasons) {	
//		Diet diet = new Deer().new Diet(); //INNER CLASS		
//		//Deer.Diet diet = new Deer.Diet(); //STATIC NESTED CLASS
//	}

	public static void main(String[] seasons) {
		System.out.print(
			switch (new Deer().new Diet().getFavorite()) {
			case APPLES -> "a";
			case BERRIES -> "b";
			default -> "c";
			}
		);

	}

}
