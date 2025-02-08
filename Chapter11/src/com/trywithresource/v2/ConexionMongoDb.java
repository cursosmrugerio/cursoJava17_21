package com.trywithresource.v2;

public class ConexionMongoDb implements AutoCloseable {
	
	ConexionMongoDb(){
		System.out.println("Constructor ConexionMongoDb");
	}
	
	void open() throws Exception {
		System.out.println("Abrir conexion");
		throw new Exception("Error al abrir la Conexion");
	}
	
	@Override
	public void close() throws Exception {
		System.out.println("Cerrar conexion");
	}

}
