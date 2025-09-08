package com.rays.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SplliterFile {

	public static void main(String[] args) throws IOException {

		BufferedReader b = new BufferedReader(new FileReader("D:\\IO\\Users.txt"));

		String line;

		for (int lineNumber = 1; (line = b.readLine()) != null; lineNumber++) {

			FileWriter f = new FileWriter("D:\\\\IO\\\\Users" + lineNumber + ".txt");
			f.write(line);
			f.close();

		}

		b.close();
		System.out.println("All lines written to separate files successfully.");

	}
}
