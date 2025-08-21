package com.rays.oop.inheritance;

public class TestShape {

 public static void main(String[] args) {

  System.out.println("---circle---");

  Circle c = new Circle();

  c.setColor("red");
  c.setBorderWidth(3);
  c.setRadius(10);

  System.out.println("color: " + c.getColor());
  System.out.println("border width: " + c.getBorderWidth());
  System.out.println("radius: " + c.getRadius());
  System.out.println("area of circle: " + c.area());

  System.out.println("---rectangle---");

  Rectangle r = new Rectangle();

  r.setColor("Blue");
  r.setBorderWidth(7);
  r.setLenght(9);
  r.setWidht(8);

  System.out.println("color: " + r.getColor());
  System.out.println("border widht: " + r.getBorderWidth());
  System.out.println("lenght: " + r.getLenght());
  System.out.println("widht: " + r.getWidht());
  System.out.println("area of rectangle: " + r.area());
  
  System.out.println("----------Triangle------------");
  
  Triangle t = new Triangle();
  
  t.setColor("Blue");
  t.setBorderWidth(7);
  t.setBase(9);
  t.setHeight(8);
  
  System.out.println("color: " + t.getColor());
  System.out.println("border widht: " + t.getBorderWidth());
  System.out.println("Base:" + t.getBase());
  System.out.println("Height :"+ t.getHeight());
  System.out.println("Area of Triangle :" + t.area());

  
  

  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
 }

}