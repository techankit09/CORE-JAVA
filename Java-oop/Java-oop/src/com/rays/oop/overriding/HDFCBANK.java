package com.rays.oop.overriding;

public class HDFCBANK extends BANK {

	@Override
	public String getName() {
		
		return "HDFC";
	}
	
	@Override
	public double interestRate() {
		
		return super.interestRate();
	}
}
