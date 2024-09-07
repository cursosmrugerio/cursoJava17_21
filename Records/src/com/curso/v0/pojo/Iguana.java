package com.curso.v0.pojo;

//Inmutables
final class Iguana {
	
  private final int age;
  //private static final int age = 10; //NO SE PUEDE


  public Iguana(int age) {
      this.age = age;
  }

  public int age() { //getter
      return age;
  }

  @Override
  public boolean equals(Object obj) {
      if (this == obj) return true;
      if (obj == null || getClass() != obj.getClass()) return false;
      Iguana iguana = (Iguana) obj;
      return age == iguana.age;
  }

  @Override
  public int hashCode() {
      return Integer.hashCode(age);
  }

  @Override
  public String toString() {
      return "Iguana[age=" + age + "]";
  }
}
