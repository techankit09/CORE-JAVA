package com.rays.oop.overriding;

public class HDFCBANK extends BANK {

	@Override
	public String getName() {
		return "HDFCBANK";
	}
	
	@Override
	
	public double interestRate() {
		return 10.10;
	}
}
