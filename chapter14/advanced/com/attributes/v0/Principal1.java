package com.attributes.v0;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class Principal1 {

	public static void main(String[] args) throws IOException {

		String currentDir = System.getProperty("user.dir");
		var path = Paths.get(currentDir, "/data/texto.txt");

		BasicFileAttributeView view = Files.getFileAttributeView(path, BasicFileAttributeView.class);
		BasicFileAttributes attributes = view.readAttributes();
		
		System.out.println("Tiempo de última modificación: "+attributes.lastModifiedTime());

		// Modify file last modified time
		FileTime lastModifiedTime = FileTime.fromMillis(attributes.lastModifiedTime().toMillis() + 10_000);
		view.setTimes(lastModifiedTime, null, null);
		
		
		// Volver a leer los atributos para verificar el cambio
	    //BasicFileAttributes newAttributes = view.readAttributes();
	    //FileTime updatedTime = newAttributes.lastModifiedTime();
	    // Mostrar el nuevo tiempo de última modificación
	    //System.out.println("Nuevo tiempo de última modificación: " + updatedTime);
	}
}
