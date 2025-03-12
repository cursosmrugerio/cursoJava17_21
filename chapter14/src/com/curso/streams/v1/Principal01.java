package com.curso.streams.v1;

import java.io.*;

public class Principal01 {

	public static void main(String[] args) throws IOException {
		
		String currentDir = System.getProperty("user.dir");
		
        File fileOrigen = new File(currentDir + "/data/origen.txt");
        File fileDestino = new File(currentDir + "/data/destino.txt");
		
		Reader in = new FileReader(fileOrigen);
		Writer out = new FileWriter(fileDestino);
		
		copyStream(in,out);
		
		InputStream inPdf = new FileInputStream(new File(currentDir+"/data/allAI.pdf"));
		OutputStream outPdf = new FileOutputStream(new File(currentDir+"/data/allAIcopy.pdf"));
		
		copyStream(inPdf,outPdf);
		
		System.out.println("Listo!!!");
		
	}


	static void copyStream(Reader in, Writer out) throws IOException {
		int b;
		while ((b = in.read()) != -1) {
			out.write(b);
		}
		out.flush();
	}
	
	static void copyStream(InputStream in, OutputStream out) throws IOException {
		int b;
		while ((b = in.read()) != -1) {
			out.write(b);
		}
		out.flush();
	}

}
