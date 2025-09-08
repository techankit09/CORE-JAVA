package com.rays.io.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestAccountSerializable {
	
	public static void main (String[]args) throws  Exception {
		
		Account a = new Account("47475765675765", 2000000.00) ;
		
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D://IO//Account.txt"));
		
		out.writeObject(a);

		out.close();
		System.out.println("object serialized successfully");
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("D://IO//Account.txt"));
		
		a = (Account)in.readObject();
		System.out.println(a);
		in.close();
	
		}
		
	}
