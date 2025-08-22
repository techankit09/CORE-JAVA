package com.rays.ExceptionHandling;

public class TestArithmetic {

	public static void main(String[] args) {
		try {
			int a = 8;
			int b = 0;
			int div = a / b;

			System.out.println("division" + div);
		} catch (ArithmeticException e) {

			System.out.println(e.getMessage());
			System.out.println("Program is Finished");
			
		}
	}
}
