package com.curso.v0;

sealed class Bird {
	final class Flamingo extends Bird {
	}
}

sealed class Monkey permits Mandrill {}

//non-sealed class EmperorTamarin extends Monkey {}

non-sealed class Mandrill extends Monkey {}

sealed class Friendly extends Mandrill permits Silly {} 

final class Silly extends Friendly {}

public class Question30 {

}
