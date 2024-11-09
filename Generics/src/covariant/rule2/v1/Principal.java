package covariant.rule2.v1;

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

		// Creamos diferentes tipos de helados
		Helado helado = new Helado();
		HeladoCrema heladoCrema = new HeladoCrema();
		HeladoChocolate heladoChocolate = new HeladoChocolate();

		// Un recipiente que puede contener Helado o cualquier supertipo
		RecipienteHelado<? super Helado> recipienteHelado;

		recipienteHelado = new RecipienteHelado<Object>(); // ✅ Funciona
		recipienteHelado = new RecipienteHelado<Helado>(); // ✅ Funciona
		// recipienteHelado = new RecipienteHelado<HeladoCrema>(); // ❌ No funciona
		// recipienteHelado = new RecipienteHelado<HeladoChocolate>(); // ❌ No funciona

		// Un recipiente que puede contener HeladoCrema o cualquier supertipo
		RecipienteHelado<? super HeladoCrema> recipienteCrema;

		recipienteCrema = new RecipienteHelado<Object>(); // ✅ Funciona
		recipienteCrema = new RecipienteHelado<Helado>(); // ✅ Funciona
		recipienteCrema = new RecipienteHelado<HeladoCrema>(); // ✅ Funciona
		// recipienteCrema = new RecipienteHelado<HeladoChocolate>(); // ❌ No funciona

		// Un recipiente que puede contener HeladoCrema o cualquier supertipo
		RecipienteHelado<? super HeladoChocolate> recipienteChocolate;

		recipienteChocolate = new RecipienteHelado<Object>(); // ✅ Funciona
		recipienteChocolate = new RecipienteHelado<Helado>(); // ✅ Funciona
		recipienteChocolate = new RecipienteHelado<HeladoCrema>(); // ✅ Funciona
		recipienteChocolate = new RecipienteHelado<HeladoChocolate>(); // ✅ Funciona

		//NO TIENE SENTIDO
		RecipienteHelado<StringBuilder> recipienteStringBuilder = 
				new RecipienteHelado<StringBuilder>(); // ✅ Funciona;
	}

}
