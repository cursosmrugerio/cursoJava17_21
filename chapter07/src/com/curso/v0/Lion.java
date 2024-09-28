package com.curso.v0;

public class Lion {
	
	class Cub {}

	static class Den {}

	static void rest() {
		//Cub a = Lion.new Cub();
		//Cub aa = new Lion().new Cub();
		//Den den = new Lion.Den();
		
		//Lion.Cub b = new Lion().Cub();
		//Lion.Cub bb = new Lion().new Cub();
		
		//Lion.Cub c = new Lion().new Cub();
		
		var d = new Den();
		
		//var e = Lion.new Cub();
		var ee = new Lion().new Cub();
		
		//Lion.Den f = Lion.new Den();
		Lion.Den ff = new Lion.Den();
		
		Lion.Den g = new Lion.Den();
		
		//var h = new Cub();
		var hh = new Lion().new Cub();
		
	}
}