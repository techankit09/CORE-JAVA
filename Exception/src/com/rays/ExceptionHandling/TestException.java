package com.rays.ExceptionHandling;

public class TestException {
	
	public static void main(String[] args) {
		
		try {
		String name = "ank";
		System.out.println(name.charAt(3));
		System.out.println(name.length());
	} catch (NullPointerException e) {
		System.out.println("exception1: " +  e.getMessage());
	} catch (IndexOutOfBoundsException e) {
	  System.out.println("exception2: " + e.getMessage());
	}  finally {
		System.out.println("Program is always run");
	}
}
}
