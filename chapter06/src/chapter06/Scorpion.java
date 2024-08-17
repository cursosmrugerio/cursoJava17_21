package chapter06;

class Arachnid {
    static StringBuilder sb = new StringBuilder();
    { sb.append("c"); }
    static { sb.append("u"); }
    { sb.append("r"); }
}

public class Scorpion extends Arachnid {
    static { sb.append("q"); }
    { sb.append("m"); }

    public static void main(String[] args) {
    	  System.out.print(Scorpion.sb + " "); //uq <=1
    	  System.out.print(Scorpion.sb + " "); //uq <=2
    	  
    	  new Arachnid(); //sb = uqcr //Instancia de la superclase
          new Scorpion(); //sb = uqcrcrm <=3
          System.out.print(Scorpion.sb); //uq uq uqcrcrm
    }
}
