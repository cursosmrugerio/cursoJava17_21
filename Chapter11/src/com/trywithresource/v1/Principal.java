package com.trywithresource.v1;

public class Principal {

	public static void main(String[] args)  {
		
		try (ConexionMongoDb con = new ConexionMongoDb()) {
			con.open();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	
		System.out.println("Fin Programa");
	}

}
