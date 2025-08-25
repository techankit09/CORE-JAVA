package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollectionMethod {
	
	public static void main(String[] args) {
		
		Collection c = new ArrayList();
		
		c.add(567);
		c.add("DannY");
		c.add('n');
		c.add(8.3);
		c.add(false);
		
		System.out.println("C:" + c);
		
		Collection c1 = new ArrayList();
		
		c1.add(765);
		c1.add("AnkiT");
		c1.add('a');
		c1.add(3.8);
		c1.add(true);
		
		System.out.println("C1:" + c1);
		c.addAll(c1);
		System.out.println(c);
		
		Collection c2 = new ArrayList();
		
		c2.add(876);
		c2.add("Federal");
		c2.add('d');
		c2.add(6.7);
		c2.add(false);
		
		System.out.println("C2:" + c2);
		c2.addAll(c);
		System.out.println("ALL:" + c2);
		
		
		
		
		
		
		
		
		
		
		
	}

}
