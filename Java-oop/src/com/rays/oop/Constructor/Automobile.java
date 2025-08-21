package com.rays.oop.Constructor;

public class Automobile {

	private String color;
	private int speed;
	private String make;
	public static final int NO_OF_GEARS = 6;

	public Automobile() {
		System.out.println("this is Default constructor");
	}

	public Automobile(String color, int speed, String make) {

		this.color = color;
		this.speed = speed;
		this.make = make;
	}
    public String getColor () {
    	return color;
    }
    public int getSpeed() {
    	return speed;
    }
    public String getMake() {
    	return make;
    }
    public void accelerator() {
		speed = speed + 10;
    System.out.println("Accelerated. Current speed:" + this.speed + "km/h");
	}
	public void brake() {
		speed = speed - 10;
	if (speed <0)
		speed = 0;
		System.out.println("Braked. Current Speed:" + this.speed +"km/h");
	}
	public void changeGear(int gear) {
		if(gear > 0 && gear <= NO_OF_GEARS) {
			System.out.println("Gear Changed to:" + gear);
		}else {
			System.out.println("Invalid Gear. Please select Gear between 1  and" + NO_OF_GEARS);
		}
	}
}

