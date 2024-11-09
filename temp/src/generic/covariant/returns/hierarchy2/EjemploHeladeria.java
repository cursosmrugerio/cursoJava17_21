package generic.covariant.returns.hierarchy2;

//Primero definimos los tipos de helados
class Helado {}

class HeladoCrema extends Helado {}

class HeladoChocolate extends HeladoCrema {}

//Definimos un recipiente genérico para helados
class RecipienteHelado<T> {
	private T contenidoHelado;

	public void poner(T helado) {
		this.contenidoHelado = helado;
	}
	public T obtener() {
		return contenidoHelado;
	}
}

public class EjemploHeladeria {
	public static void main(String[] args) {
		// Creamos diferentes tipos de helados
		Helado helado = new Helado();
		HeladoCrema heladoCrema = new HeladoCrema();
		HeladoChocolate heladoChocolate = new HeladoChocolate();
		
		// Un recipiente que puede contener Helado o cualquier supertipo
		RecipienteHelado<? super Helado> recipienteHelado;
		
		recipienteHelado = new RecipienteHelado<Object>(); // ✅ Funciona
		recipienteHelado = new RecipienteHelado<Helado>(); // ✅ Funciona
//		recipienteHelado = new RecipienteHelado<HeladoCrema>(); // ❌ No funciona
//		recipienteHelado = new RecipienteHelado<HeladoChocolate>(); // ❌ No funciona

		// Un recipiente que puede contener HeladoCrema o cualquier supertipo
		RecipienteHelado<? super HeladoCrema> recipienteCrema;
		
//		recipienteCrema = new RecipienteHelado<Object>(); // ✅ Funciona
//		recipienteCrema = new RecipienteHelado<Helado>(); // ✅ Funciona
//		recipienteCrema = new RecipienteHelado<HeladoCrema>(); // ✅ Funciona
//		recipienteCrema = new RecipienteHelado<HeladoChocolate>(); // ❌ No funciona
		
		recipienteCrema = recipienteHelado; // ¡Esto funciona!

		// Un recipiente que puede contener HeladoChocolate o cualquier supertipo
		RecipienteHelado<? super HeladoChocolate> recipienteChocolate;
		
		recipienteChocolate = new RecipienteHelado<Object>(); // ✅ Funciona
		recipienteChocolate = new RecipienteHelado<Helado>(); // ✅ Funciona
		recipienteChocolate = new RecipienteHelado<HeladoCrema>(); // ✅ Funciona
		recipienteChocolate = new RecipienteHelado<HeladoChocolate>(); // ✅ Funciona
		
		recipienteChocolate = recipienteCrema; // ¡Esto funciona!

		// Demostramos que podemos poner diferentes tipos de helados
		recipienteHelado.poner(helado); // ✅ Funciona
		recipienteHelado.poner(heladoCrema); // ✅ Funciona
		recipienteHelado.poner(heladoChocolate); // ✅ Funciona
		
		// recipienteCrema.poner(helado); // ❌ No funciona
		recipienteCrema.poner(heladoCrema); // ✅ Funciona
		recipienteCrema.poner(heladoChocolate); // ✅ Funciona

		// recipienteChocolate.poner(helado); // ❌ No funciona
		// recipienteChocolate.poner(heladoCrema); // ❌ No funciona
		recipienteChocolate.poner(heladoChocolate); // ✅ Funciona
		
		//              RecipienteHelado<? super Helado>
		servirHeladoOne(new RecipienteHelado<Helado>());
		//servirHeladoOne(new RecipienteHelado<HeladoCrema>()); // ❌ No funciona
		//servirHeladoOne(new RecipienteHelado<HeladoChocolate>());//❌ No funciona
	
		//              RecipienteHelado<? super HeladoCrema>
		servirHeladoTwo(new RecipienteHelado<Helado>());
		servirHeladoTwo(new RecipienteHelado<HeladoCrema>());
		//servirHeladoTwo(new RecipienteHelado<HeladoChocolate>()); //❌ No funciona
		
		//                RecipienteHelado<? super HeladoChocolate>
		servirHeladoThree(new RecipienteHelado<Helado>());
		servirHeladoThree(new RecipienteHelado<HeladoCrema>());
		servirHeladoThree(new RecipienteHelado<HeladoChocolate>());
	}

	public static void servirHeladoOne(RecipienteHelado<? super Helado> recipiente) {
		recipiente.poner(new Helado()); // // ✅ Funciona
		recipiente.poner(new HeladoCrema()); // ✅ Funciona
		recipiente.poner(new HeladoChocolate()); // ✅ Funciona
	}

	public static void servirHeladoTwo(RecipienteHelado<? super HeladoCrema> recipiente) {
		//recipiente.poner(new Helado()); // ❌ No funciona
		recipiente.poner(new HeladoCrema()); // ✅ Funciona
		recipiente.poner(new HeladoChocolate()); // ✅ Funciona
	}
	
	// Métodos que demuestran el uso práctico
	public static void servirHeladoThree(RecipienteHelado<? super HeladoChocolate> recipiente) {
		// recipiente.poner(new Helado()); // ❌ No funciona
		// recipiente.poner(new HeladoCrema()); // ❌ No funciona
		recipiente.poner(new HeladoChocolate()); // ✅ Funciona
	}

}
