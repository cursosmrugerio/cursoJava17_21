package com.curso.v0;

import java.io.File;

public class FileExample {
    public static void main(String[] args) {
        // Print current working directory
        System.out.println("Current working directory: " + System.getProperty("user.dir"));
        
        
        
        // Use absolute paths based on the current directory
        String currentDir = System.getProperty("user.dir");
        File zooFile1 = new File(currentDir + "/data/stripesX.txt");
        File zooFile2 = new File(currentDir, "data/stripes.txt");
        File parent = new File(currentDir);
        File zooFile3 = new File(parent, "data/stripes.txt");

        System.out.println(zooFile1.exists());
//        
//        // Additional information about the files
//        System.out.println("zooFile1 path: " + zooFile1.getAbsolutePath());
//        System.out.println("zooFile2 path: " + zooFile2.getAbsolutePath());
//        System.out.println("zooFile3 path: " + zooFile3.getAbsolutePath());
//        
//        // Check if zooFile1, zooFile2, and zooFile3 refer to the same file
//        System.out.println("zooFile1 equals zooFile2: " + zooFile1.equals(zooFile2));
//        System.out.println("zooFile1 equals zooFile3: " + zooFile1.equals(zooFile3));
    }
}
