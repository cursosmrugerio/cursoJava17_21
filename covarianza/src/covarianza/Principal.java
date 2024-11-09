package covarianza;

class Abuelo {
	Abuelo execute(){
		System.out.println("Execute Abuelo");
		return new Abuelo();
	}
}

class Papa extends Abuelo {
	@Override
	Papa execute(){
		System.out.println("Execute Papa");
		return new Papa();
	}
}

class Hijo extends Papa {
	@Override
	Hijo execute(){
		System.out.println("Execute Hijo");
		return new Hijo();
	}
}

public class Principal {

	public static void main(String[] args) {
		
		Abuelo abuelo = new Hijo();
		abuelo.execute();
		
		
		Hijo hijo = new Hijo();
		Papa papa = hijo;
		abuelo = papa;
		

	}

}
