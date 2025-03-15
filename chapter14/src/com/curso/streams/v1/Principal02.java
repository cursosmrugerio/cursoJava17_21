package com.curso.streams.v1;

import java.io.*;

public class Principal02 {

	public static void main(String[] args) throws IOException {

		String currentDir = System.getProperty("user.dir");


		InputStream inPdf = new FileInputStream(new File(currentDir + "/data/allAI.pdf"));
		OutputStream outPdf = new FileOutputStream(new File(currentDir + "/data/allAIcopy2.pdf"));

		copyStream(inPdf, outPdf);

		System.out.println("Listo!!!");

	}

	static void copyStream(InputStream in, OutputStream out) throws IOException {
		int batchSize = 1024;
		var buffer = new byte[batchSize];
		int lengthRead;
		while ((lengthRead = in.read(buffer, 0, batchSize)) > 0) {
			//System.out.println("lengthRead: "+lengthRead);
			out.write(buffer, 0, lengthRead);
			out.flush();
		}
	}

}
