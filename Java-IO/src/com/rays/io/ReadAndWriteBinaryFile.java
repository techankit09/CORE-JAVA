package com.rays.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadAndWriteBinaryFile {

	public static void main(String[] args) throws Exception {

		FileInputStream in = new FileInputStream("D://IO//tanjiro-kamado-3840x2160-16956.jpg");

		FileOutputStream out = new FileOutputStream("D://IO//Yorichi-3840x2160-16956.jpg");

		int i = in.read();

		while (i != -1) {
			System.out.println(i);
			out.write(i);
			i = in.read();
		}

		in.close();
		out.close();
		
		

	}

}
