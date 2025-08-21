package com.rays.oop.overriding;

public class ICICIBANK extends BANK{

	@Override
	
	public String getName() {
		return "ICICIBANK";
	}
	
	@Override
	
	public double interestRate() {
		return 11.08;
	}
}
