package com.rays.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Students {

    public static void main(String[] args) throws Exception {
           
            BufferedReader file = new BufferedReader(new FileReader("D://IO//Boys.txt"));
            BufferedReader file1 = new BufferedReader(new FileReader("D://IO//Girls.txt"));

            
            BufferedWriter file2 = new BufferedWriter(new FileWriter("D://IO//Students.txt", true));

            String line;

            
            while ((line = file.readLine()) != null) {
                file2.write(line);
                file2.newLine();
            }

            
            while ((line = file1.readLine()) != null) {
                file2.write(line);
                file2.newLine();
            }

            System.out.println("Data merged Sucessfully");

            file.close();
            file1.close();
            file2.close();

    }
}
    



