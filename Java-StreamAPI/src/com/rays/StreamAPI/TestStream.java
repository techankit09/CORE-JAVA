package com.rays.StreamAPI;

import java.util.ArrayList;

public class TestStream {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();


		list.add("Ankit");
		list.add("Lucky");
		list.add("Kunal");
		list.add("Amit");
		list.add("Anshul");
		list.add("Uday");
		

		list.forEach(System.out::println);
		
		System.out.println("-------------------------");
		
		list.stream().distinct().sorted().forEach(e -> System.out.println(e));
		System.out.println("-------");
		list.stream().filter(e-> e.startsWith("U")).forEach(e -> System.out.println(e));
		System.out.println("--------------");
		list.stream().filter(e-> e.endsWith("t")).forEach(e -> System.out.println(e));

	}

}
