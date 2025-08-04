package co.rays.basic;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    		System.out.println("Enter NO");
    		int i = sc.nextInt();
    		
    		while(i<10000) {
    			System.out.println(i);
    			i = i+i;
		}
	}
}
