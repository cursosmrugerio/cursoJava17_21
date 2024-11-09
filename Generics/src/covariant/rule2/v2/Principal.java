package covariant.rule2.v2;

//Primero definimos los tipos de helados
class Helado {
} // Abuelo

class HeladoCrema extends Helado {
} // Papa

class HeladoChocolate extends HeladoCrema {
} // Nieto

//Definimos un recipiente genérico para helados
class RecipienteHelado<T extends Helado> {
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
		
		System.out.println("V2 Rule2");

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
		

	}

}
