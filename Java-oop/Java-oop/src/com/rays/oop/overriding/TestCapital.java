package com.rays.oop.overriding;

public class TestCapital {
	
	public static void main(String[] args) {
		
		India i = new State1();
		System.out.println("State:" + i.getCountryName() + "\n"+ "Capital:" + i.getCapitalName());
	
       India i2 = new State2();
       System.out.println("State:" + i2.getCountryName() + "\n" + "Capital:" + i2.getCapitalName());
       
       India i3 = new State3();
       System.out.println("State:" + i3.getCountryName() + "\n" + "Capital:" + i3.getCapitalName());
       
       India i4 = new State4();
       System.out.println("State:" + i4.getCountryName() + "\n" + "Capital:" + i4.getCapitalName());
       
       India i5= new State5();
       System.out.println("State:" + i5.getCountryName() + "\n" + "Capital:" + i5.getCapitalName());
	
	}
}
