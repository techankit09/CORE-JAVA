package com.rays.oop.Constructor;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestPerson extends Person {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
		Person p = new Person("Ram", "indore", sdf.parse("2001-12-13"));

		System.out.println("Name:" + p.getName()+ "\n"+ "Address:"+ p.getAddress()+"\n" + "Dob:" + sdf.format(p.getDob()));
	}
}