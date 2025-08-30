package com.rays.collection.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class TestStudent {

	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<Student>();
		
		list.add( new Student("Ankit",344043,99,95,90));
		list.add( new Student("Lucky",344044,80,86,95));
		list.add( new Student("Danny",344045,89,85,90));
		list.add( new Student("Kunal",344046,1 ,2,99));
		list.add( new Student("Krati",344047,45,33,9));
		list.add( new Student("Lucyy",344048,8,9,6));
list.forEach(System.out::println);
	
System.out.println("-------------------------");
		Collections.sort(list);
		list.forEach(System.out::println);
	}
}
