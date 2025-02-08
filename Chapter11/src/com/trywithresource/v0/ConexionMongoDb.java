package com.trywithresource.v0;

public class ConexionMongoDb {
	
	ConexionMongoDb(){
		System.out.println("Constructor ConexionMongoDb");
	}
	
	void open() throws Exception {
		System.out.println("Abrir conexion");
		throw new Exception("Error al abrir la Conexion");
	}
	
	void close() throws Exception {
		System.out.println("Cerrar conexion");
	}

}
