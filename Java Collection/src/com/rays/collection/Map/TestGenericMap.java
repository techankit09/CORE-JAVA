package com.rays.collection.Map;

import java.util.HashMap;
import java.util.Map;

public class TestGenericMap {

	public static void main(String[] args) {
		
    // Map<Integer, String> map = new HashMap<Integer, String>();
		
		Map<Integer, String> m = new HashMap<Integer, String>();
		
		m.put(8 , "Apple");
		m.put(10,"Orange");
		m.put(11,"Orange");
	//	m.put("orange" , 20);  compailation error
 System.out.println(m);
	}
}
