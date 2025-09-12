package com.rays.java8;

@FunctionalInterface

public interface HelloFunctionalInt {
	
	public int sum (int i , int j);
	
	public default void m1(){
		
		System.out.println("This is Default method ");
	}
	
	public static void m2() {
		System.out.println("This is Static Mathod");
	}
	
	

}
