package generic.covariant.returns.hierarchy2;

//Primero definimos los tipos de helados
class Helado {}

class HeladoCrema extends Helado {}

class HeladoChocolate extends HeladoCrema {}

//Definimos un recipiente genérico para helados
class RecipienteHelado<T> {
	private T contenido;

	public void poner(T helado) {
		this.contenido = helado;
	}
	public T obtener() {
		return contenido;
	}
}

public class EjemploHeladeria {
	public static void main(String[] args) {
		// Creamos diferentes tipos de helados
		Helado helado = new Helado();
		HeladoCrema heladoCrema = new HeladoCrema();
		HeladoChocolate heladoChocolate = new HeladoChocolate();

		// Un recipiente que puede contener HeladoCrema o cualquier supertipo
		RecipienteHelado<? super HeladoCrema> recipienteCrema = new RecipienteHelado<Helado>();

		// Un recipiente que puede contener HeladoChocolate o cualquier supertipo
		RecipienteHelado<? super HeladoChocolate> recipienteChocolate = recipienteCrema; // ¡Esto funciona!

		// Demostramos que podemos poner diferentes tipos de helados
		recipienteCrema.poner(heladoCrema); // ✅ Funciona
		recipienteCrema.poner(heladoChocolate); // ✅ Funciona
		// recipienteCrema.poner(helado); // ❌ No funciona

		// recipienteChocolate.poner(heladoCrema); // ❌ No funciona
		recipienteChocolate.poner(heladoChocolate); // ✅ Funciona
		// recipienteChocolate.poner(helado); // ❌ No funciona
		
		servirHeladoOne(new RecipienteHelado<Helado>());
		servirHeladoOne(new RecipienteHelado<HeladoCrema>());
		
		servirHeladoTwo(new RecipienteHelado<Helado>());
		
		servirHeladoThree(new RecipienteHelado<Helado>());
		//servirHeladoThree(new RecipienteHelado<HeladoCrema>()); // ❌ No funciona
	}

	// Métodos que demuestran el uso práctico
	public static void servirHeladoOne(RecipienteHelado<? super HeladoChocolate> recipiente) {
		// recipiente.poner(new Helado()); // ❌ No funciona
		// recipiente.poner(new HeladoCrema()); // ❌ No funciona
		recipiente.poner(new HeladoChocolate()); // ✅ Funciona
	}

	public static void servirHeladoTwo(RecipienteHelado<? super HeladoCrema> recipiente) {
		//recipiente.poner(new Helado()); // ❌ No funciona
		recipiente.poner(new HeladoCrema()); // ✅ Funciona
		recipiente.poner(new HeladoChocolate()); // ✅ Funciona
	}
	
	public static void servirHeladoThree(RecipienteHelado<? super Helado> recipiente) {
		recipiente.poner(new Helado()); // // ✅ Funciona
		recipiente.poner(new HeladoCrema()); // ✅ Funciona
		recipiente.poner(new HeladoChocolate()); // ✅ Funciona
	}
}
