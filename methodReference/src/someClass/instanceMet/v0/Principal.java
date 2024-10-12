package someClass.instanceMet.v0;

import java.util.function.BiConsumer;

public class Principal {

	public static void main(String[] args) {
		
		Mecanico instanciaMec = new Mecanico();
		Carro carro = new Carro();
		carro.id = 55;
		
		BiConsumer<Mecanico,Carro> biCons = Mecanico::reparar;
				//lambda
				//(m,c) -> m.reparar(c);
		
		biCons.accept(instanciaMec,carro);
		
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
