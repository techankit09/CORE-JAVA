package com.rays.oop.overriding;

public class TestHomeLoan {

	public static void main(String[] args) {
		
		BANK b1 = new AXIXBANK();
	System.out.println("BANK NAME :" + b1.getName() + "Interest Rate :" + b1.interestRate());
	
	    BANK b2 = new HDFCBANK();
	System.out.println("BANK NAME :" + b2.getName() + "Interest Rate :" + b2.interestRate());
	
	    BANK b3 = new ICICIBANK();
	System.out.println("BANK NAME :" + b3.getName() + "Interest Rate :" + b3.interestRate());
	}
}
