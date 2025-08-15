package com.rays.oop.overriding;

public class AXIXBANK extends BANK{
	
	@Override
	
	public String getName() {
		return "AXIXBANK";
	}
	
	@Override
	public double interestRate() {
		return 9.0 ;
	}

}
