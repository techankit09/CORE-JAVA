package com.rays.oop.polymorphism;

public class TestShapeByMethodReturnType {

	public static void main(String[] args) {

		Shape[] s = new Shape[3];
		
		s[0] = Shape.getShape(1); //circle
		s[1] = Shape.getShape(2); //rectangle
		s[2] = Shape.getShape(3); //triangle
		
		
		Circle c = (Circle) s[0];
		c.setRadius(2);

		Rectangle r = (Rectangle) s[1];
		r.setLength(5);
		r.setWidth(10);

		Triangle t = (Triangle) s[2];
		t.setBase(5);
		t.setHeight(10);
		
		for (int i = 0; i < s.length; i++) {
		
		System.out.println("area:"+s[i].area());
		
	}

}
}