package com.rays.oop.overriding;


public class TestShape {

	public static void main(String[] args) {
		
		System.out.println("--------Circle---------");
		
		Shape s = new Circle();
      Circle  c = (Circle) s;
      
      s.setColor("RED");
      s.setBorderWidth(8);
      c.setRadius(9);
      
      System.out.println("color :" + s.getColor());
      System.out.println("BorderWidth :" + s.getBorderWidth());
      System.out.println("Radius:" + c.getRadius());
      System.out.println("Area of Circle:" + s.area());
      
      System.out.println("--------Rectangle---------");
      
     Shape s1 = new Rectangle();
     Rectangle r = (Rectangle) s1;
     
     r.setLength(9);
     r.setWidth(9);
     
     System.out.println("Area of Rectngle :" + r.area());
	}
}
