package com.curso.v0;

class W {}

class X extends W {}

class Y extends X {}

class Z<Y> { // INSERT CODE HERE 
	//Y y = new Y(); //NO SE PUEDE
	W w1 = new W();
	W w2 = new X();
	//W w3 = new Y();
	//Y y1 = new W();
	//Y y1 = new Y();
}

public class Question14 {

}
