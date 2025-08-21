package com.rays.oop.inheritance;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.rays.encapsulation.Person;

public class TestPerson {
	
	public static void main(String[]args)throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		Businessman b = new Businessman();
		
        b.setName("Danny");
        b.setAddress("Indore");
        b.setIncome(200000);
		
        
        System.out.println("Name:" + b.getName());
        System.out.println("Address:" + b.getAddress());
        System.out.println("Income:" + b.getIncome());
        
        
        System.out.println("------------Doctor-------------");
        
        Doctor d = new Doctor();
        
        d.setName("Danny");
        d.setAddress("Indore");
        d.setRegistrationNo("44547553536");
        
        System.out.println("Name:" + d.getName());
        System.out.println("Address:"+ d.getAddress());
        System.out.println("Registration No :" + d.getRegistrationNo());
        
        System.out.println("-------------Student-------------");
        
        
        Student s = new Student();
        
        s.setName("Danny");
        s.setAddress("Indore");
        s.setDob(sdf.parse("2001-12-13"));
        s.setRollNo("143341");
        s.setMarks(99);
        
        System.out.println("Name:"+ s.getName());
        System.out.println("Address:"+ s.getAddress());
        System.out.println("Dob :" + sdf.format(s.getDob()));
        System.out.println("Roll No:"+ s.getRollNo());
        System.out.println("Marks : "+ s.getMarks());
	}	
}
