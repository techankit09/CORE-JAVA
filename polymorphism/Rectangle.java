package com.rays.oop.polymorphism;

public class Rectangle extends Shape {

	private int lenght;
	private int width;

	public Rectangle(int length , int width) {
		this.lenght = lenght;
		this.width  = width;
	}

	@Override
	public double area() {

		double area = lenght * width;

		return area;
	}
}