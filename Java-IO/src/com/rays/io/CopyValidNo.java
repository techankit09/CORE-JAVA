package com.rays.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class CopyValidNo{
	
	public static void main(String[] args) throws Exception {

		BufferedReader oldNo = new BufferedReader(new FileReader("D://IO//Number.txt"));

		BufferedWriter newNo = new BufferedWriter(new FileWriter("D://IO//ValidNumber.txt"));

		String No = oldNo.readLine();

		while (No != null) {
			if (No.length() == 10 ){
				System.out.println("valid No : " + No);
				
				newNo.write(No);
				newNo.newLine();
			}
			No = oldNo.readLine();
		}

		System.out.println("valid email copy successfully");
		oldNo.close();
	
		newNo.close();

	
	}

}
