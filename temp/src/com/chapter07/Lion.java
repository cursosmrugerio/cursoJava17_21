package com.chapter07;

public class Lion {
	
	class Cub {
	}

	static class Den {
	}

	static void rest() {
		//A
		//Cub a = Lion.new Cub();
		Cub aa = new Lion().new Cub();
		
		//B
		//Lion.Cub b = new Lion().Cub();
		Lion.Cub bb = new Lion().new Cub();
		
		//C
		Lion.Cub c = new Lion().new Cub();
		
		//D
		var d = new Den();
		
		//E
		//var e = Lion.new Cub();
		var e = new Lion().new Cub();
		
		//F
		//Lion.Den f = Lion.new Den();
		Lion.Den ff = new Lion.Den();
		
		//G
		Lion.Den g = new Lion.Den();
		
		//H
		//var h = new Cub();
		var hh = new Lion().new Cub();
		
	}
}