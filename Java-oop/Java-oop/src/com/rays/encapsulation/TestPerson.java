package com.rays.encapsulation;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestPerson {
	
	public static void main(String[]args)throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		Person p = new Person();
		
        p.setName("Danny");
        p.setAddress("Indore");
        p.setDob(sdf.parse("2001-12-13"));
		
        
        System.out.println("Name:" + p.getName());
        System.out.println("Address:" + p.getAddress());
        System.out.println("Dob:" + p.getDob());
	}
}

