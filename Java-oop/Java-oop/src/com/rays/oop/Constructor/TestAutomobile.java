package com.rays.oop.Constructor;


public class TestAutomobile {

	public static void main(String[] args) {

		Automobile a = new Automobile("Black", 100, "BMW");

		System.out.println(
				"Car Color:" + a.getColor() + "\n" + " Car Speed:" + a.getSpeed() + "\n" + "Brand Name:" + a.getMake());
		
		System.out.println("Number of Gears: " + Automobile.NO_OF_GEARS);

		  a.accelerator();
		  a.changeGear(6);
		  a.accelerator();
		  a.brake();
		  System.out.println("Final Speed: " + a.getSpeed() + " km/h");
	}
}
