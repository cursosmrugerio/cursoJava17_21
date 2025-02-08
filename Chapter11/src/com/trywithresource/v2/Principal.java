package com.trywithresource.v2;

public class Principal {

	public static void main(String[] args)  {
		System.out.println("V2");
		
		//Effectively final
		ConexionMongoDb con = new ConexionMongoDb();
		
		try (con) {
			con.open();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	
		//con = null;
		System.out.println("Fin Programa");
	}

}
