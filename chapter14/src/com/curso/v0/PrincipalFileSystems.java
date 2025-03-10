package com.curso.v0;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class PrincipalFileSystems {

	public static void main(String[] args) {
		Path zooPath1 = FileSystems.getDefault().getPath("/home/tiger/data/stripes.txt");
		Path zooPath2 = FileSystems.getDefault().getPath("/home", "tiger", "data", "stripes.txt");
		System.out.println(zooPath1);
		System.out.println(zooPath2);
		
		FileSystem fs = FileSystems.getDefault();
		Path zooPath3 = fs.getPath("/home", "tiger", "data", "stripes.txt");
		System.out.println(zooPath3);
		

	}

}
