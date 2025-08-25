package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
	
	public static void main(String[] args) {
		
		Collection c = new ArrayList();
		
		c.add(600);
		c.add("DANNY");
		c.add('N');
		c.add(6.2);
		c.add(true);
		
		System.out.println("C :" + c);
		
		for( Object o : c) {
			System.out.println(o);
		}
		
		
		
	}

}
