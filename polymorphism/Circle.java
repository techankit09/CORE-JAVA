package com.rays.oop.polymorphism;

	public class Circle extends Shape {

		private int radius;
		
		public Circle(int radius) {
			this.radius = radius;
		}
 
	

		@Override
		public double area() {

			double area = Math.PI * radius * radius;

			return area;
		}

	}


