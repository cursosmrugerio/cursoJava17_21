package com.curso.v0;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;

public class PathExample {
    public static void main(String[] args) {
        // Print current working directory
        System.out.println("Current working directory: " + System.getProperty("user.dir"));
        
        // Use absolute paths based on the current directory
        String currentDir = System.getProperty("user.dir");
        Path zooPath1 = Paths.get(currentDir, "data", "stripes.txt");
        //Path zooPath2 = Paths.get(currentDir).resolve("data/stripes.txt");
        Path parent = Paths.get(currentDir);
        //Path zooPath3 = parent.resolve("data").resolve("stripes.txt");

        // Check if path exists
        System.out.println(Files.exists(zooPath1));
        
//        // Additional information about the paths
//        System.out.println("zooPath1: " + zooPath1.toString());
//        System.out.println("zooPath1 absolute: " + zooPath1.toAbsolutePath());
//        System.out.println("zooPath2: " + zooPath2.toString());
//        System.out.println("zooPath3: " + zooPath3.toString());
//        
//        // Check if paths are equal
//        System.out.println("zooPath1 equals zooPath2: " + zooPath1.equals(zooPath2));
//        System.out.println("zooPath1 equals zooPath3: " + zooPath1.equals(zooPath3));
//        
//        // Additional Path API features
//        try {
//            System.out.println("Real path: " + zooPath1.toRealPath());
//        } catch (IOException e) {
//            System.out.println("Error getting real path: " + e.getMessage());
//        }
//        
//        System.out.println("File name: " + zooPath1.getFileName());
//        System.out.println("Parent path: " + zooPath1.getParent());
//        System.out.println("Root: " + zooPath1.getRoot());
    }
}
