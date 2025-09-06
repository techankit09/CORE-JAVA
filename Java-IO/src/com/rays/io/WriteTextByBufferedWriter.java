package com.rays.io;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriteTextByBufferedWriter {

	public static void main(String[] args) throws Exception {

		BufferedWriter file = new BufferedWriter(new FileWriter("D://IO//ankit.txt",true));

		file.write("My name is Ankit {");
		file.newLine();
		file.write("I'm from indore {");
		file.newLine();
		file.write("System.out.println(" + "Hello Java" + ")");
		file.newLine();
		file.write("}}");

		System.out.println("java file write successfully");

		file.close();

	}

}