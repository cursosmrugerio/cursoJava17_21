package covariant.rule2.v3;

//Primero definimos los tipos de helados
class Helado {
} // Abuelo

class HeladoCrema extends Helado {
} // Papa

class HeladoChocolate extends HeladoCrema {
} // Nieto

//Definimos un recipiente genérico para helados
class RecipienteHelado<T> {
	private T contenidoHelado;

	public void poner(T contenidoHelado) {
		this.contenidoHelado = contenidoHelado;
	}

	public T obtener() {
		return contenidoHelado;
	}
}

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("V3 Rule2");

		// Creamos diferentes tipos de helados
		Helado helado = new Helado();
		HeladoCrema heladoCrema = new HeladoCrema();
		HeladoChocolate heladoChocolate = new HeladoChocolate();

		// Un recipiente que puede contener Helado ************************************
		RecipienteHelado<? super Helado> recipienteHelado;

		recipienteHelado = new RecipienteHelado<Helado>(); // ✅ Funciona
		// recipienteHelado = new RecipienteHelado<HeladoCrema>(); // ❌ No funciona
		// recipienteHelado = new RecipienteHelado<HeladoChocolate>(); // ❌ No funciona
		
		recipienteHelado.poner(helado); // ✅ Funciona
		recipienteHelado.poner(heladoCrema); // ✅ Funciona
		recipienteHelado.poner(heladoChocolate); // ✅ Funciona

		// Un recipiente que puede contener HeladoCrema o cualquier supertipo *********
		RecipienteHelado<? super HeladoCrema> recipienteCrema;

		recipienteCrema = new RecipienteHelado<Helado>(); // ✅ Funciona
		recipienteCrema = new RecipienteHelado<HeladoCrema>(); // ✅ Funciona
		// recipienteCrema = new RecipienteHelado<HeladoChocolate>(); // ❌ No funciona
		
		//recipienteCrema.poner(helado); // ❌ No funciona
		recipienteCrema.poner(heladoCrema); // ✅ Funciona
		recipienteCrema.poner(heladoChocolate); // ✅ Funciona

		// Un recipiente que puede contener HeladoChocolate o cualquier supertipo ******
		RecipienteHelado<? super HeladoChocolate> recipienteChocolate;

		recipienteChocolate = new RecipienteHelado<Helado>(); // ✅ Funciona
		recipienteChocolate = new RecipienteHelado<HeladoCrema>(); // ✅ Funciona
		recipienteChocolate = new RecipienteHelado<HeladoChocolate>(); // ✅ Funciona
		
		//recipienteChocolate.poner(helado); // ❌ No funciona
		//recipienteChocolate.poner(heladoCrema); // ❌ No funciona
		recipienteChocolate.poner(heladoChocolate); // ✅ Funciona
		
		System.out.println("********************");
		
		servirHeladoOne(new RecipienteHelado<Object>());
		servirHeladoOne(new RecipienteHelado<Helado>());
		//servirHeladoOne(new RecipienteHelado<HeladoCrema>()); // ❌ No funciona
		//servirHeladoOne(new RecipienteHelado<HeladoChocolate>()); // ❌ No funciona
		
		servirHeladoTwo(new RecipienteHelado<Object>());
		servirHeladoTwo(new RecipienteHelado<Helado>());
		servirHeladoTwo(new RecipienteHelado<HeladoCrema>()); 
		//servirHeladoTwo(new RecipienteHelado<HeladoChocolate>()); // ❌ No funciona
		
		servirHeladoThree(new RecipienteHelado<Object>());
		servirHeladoThree(new RecipienteHelado<Helado>());
		servirHeladoThree(new RecipienteHelado<HeladoCrema>()); 
		servirHeladoThree(new RecipienteHelado<HeladoChocolate>()); 
		
		RecipienteHelado<Helado> recipiente1 = new RecipienteHelado<>();
		recipiente1.poner(new HeladoChocolate());
		
		RecipienteHelado<? super Helado> recipiente2 = recipiente1;
		RecipienteHelado<? super HeladoCrema> recipiente3 = recipiente2;
		RecipienteHelado<? super HeladoChocolate> recipiente4 = recipiente3;
		
		System.out.println(recipiente4.obtener());

	}
	
	public static void servirHeladoOne(RecipienteHelado<? super Helado> recipiente) {
		//recipiente.poner(new Object());// ❌ No funciona
		recipiente.poner(new Helado());//✅ Funciona
		recipiente.poner(new HeladoCrema()); //✅ Funciona
		recipiente.poner(new HeladoChocolate()); //✅ Funciona
	}
	
	public static void servirHeladoTwo(RecipienteHelado<? super HeladoCrema> recipiente) {
		//recipiente.poner(new Object());// ❌ No funciona
		//recipiente.poner(new Helado());//❌ No funciona
		recipiente.poner(new HeladoCrema()); //✅ Funciona
		recipiente.poner(new HeladoChocolate()); //✅ Funciona
	}
	
	public static void servirHeladoThree(RecipienteHelado<? super HeladoChocolate> recipiente) {
		//recipiente.poner(new Object());// ❌ No funciona
		//recipiente.poner(new Helado());//❌ No funciona
		//recipiente.poner(new HeladoCrema()); //❌ No funciona
		recipiente.poner(new HeladoChocolate()); //✅ Funciona
	}
	

}
