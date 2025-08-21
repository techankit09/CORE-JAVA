package com.rays.oop.Constructor;

import java.util.Date;

public class Person {

	protected String name;
	protected String address;
	protected Date dob;

	public Person() {
		System.out.println("");
	}

	public Person(String name, String address, Date dob) {
		this.name = name;
		this.address = address;
		this.dob = dob;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public Date getDob() {
		return dob;
	}
}
