package com.rays.oop.polymorphism;

public class TestShapeByArrays {

	public static void main(String[] args) {

		Shape[] s = new Shape[3];

		s [0] = new Circle(5);
		s[1]  = new Rectangle(9,8);
		s[2]  = new Triangle(6,8);
		
		
		
		for (int i = 0; i < s.length; i++) {
			System.out.println("Area :"+ s[i].area());
		}
	}
		}
        

