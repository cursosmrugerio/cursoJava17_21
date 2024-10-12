package someObject.instanceMet.v0;

import java.util.function.Consumer;

public class Principal {

	public static void main(String[] args) {
		
		Mecanico instanciaMec = new Mecanico();
		Carro carro = new Carro();
		carro.id = 5;
		
		Consumer<Carro> cons = instanciaMec::reparar;
				//lambda
				//c -> instanciaMec.reparar(c);
		
		cons.accept(carro);
		
	}

}

class Carro{
	int id;
	String color;
}

class Mecanico {
	void reparar(Carro c) {
		System.out.println("Reparando carro id: "+c.id);
	}
}
