package com.curso.v0;

import java.io.*;

public class StuckTurkeyCage implements AutoCloseable {
    public void close() throws FileNotFoundException  {
        throw new FileNotFoundException("Cage not closed");
    }

    public static void main(String[] args) throws Exception {
        try (StuckTurkeyCage t = new StuckTurkeyCage()) {
            System.out.println("put turkeys in");
        }
    }
}
