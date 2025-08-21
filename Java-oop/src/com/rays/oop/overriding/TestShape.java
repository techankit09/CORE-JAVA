package com.rays.oop.overriding;


public class TestShape {

	public static void main(String[] args) {
		
		System.out.println("--------Circle---------");
		
	 Shape s = new Circle();
	Circle c = (Circle) s;
	
	s.setColor("Red");
	s.setBorderWidth(9);
	c.setRadius(8);
	
	System.out.println("Color:"+ s.getColor());
	System.out.println("BorderWidth :" + s.getBorderWidth());
	System.out.println("Area Of Circle:" + s.area());
	System.out.println("Radius:"+ c.getRadius());
	
	System.out.println("--------Rectangle---------");
	
	Shape s1 = new Rectangle();
  Rectangle r= (Rectangle) s1;
  
    s.setColor("Red");
    s.setBorderWidth(7);
    r.setLength(6);
    r.setWidth(5);
    
    System.out.println("Color:" + s.getColor());
    System.out.println("BorderWidth:"+ s.getBorderWidth());
    System.out.println("Length:" + r.getLength());
    System.out.println("Width:" + r.getWidth());
    System.out.println("Area of Reactangle:"+ r.area());
    
	}
}
