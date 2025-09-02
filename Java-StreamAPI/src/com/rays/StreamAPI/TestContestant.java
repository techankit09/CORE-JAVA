package com.rays.StreamAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TestContestant {
	
	public static void main(String[] args) {
		
		List<Contestant> list = new ArrayList<Contestant>();
		
		list.add(new Contestant("Ankit", "9344178451"));
		list.add(new Contestant("Lucky", "9943188452"));
		list.add(new Contestant("kunal", "9749177453"));
		list.add(new Contestant("Amit", "9749177453"));
		list.add(new Contestant("Uday", "93431724558"));
		list.add(new Contestant("Anshul", "93431734568"));
		list.add(new Contestant("Prateek", "99343175471"));
		list.add(new Contestant("Krati", "93431786618"));
		
		System.out.println("----Get the Phone No----");
		
		list.stream().map(e -> e.phone).forEach(e -> System.out.println(e));
		
		System.out.println("----Get the vaild phone no----");
		
		list.stream().map(e -> e.phone).filter(e -> e.length()==10).forEach(e -> System.out.println(e));
		
		System.out.println("----Remove Duplicate Phone No----");
		
		list.stream().map(e -> e.phone).filter(e -> e.length()==10).distinct().forEach(e -> System.out.println(e));
		
		System.out.println("----Get Lucky Draw Winner----");
	    
		list.stream().map(e -> e.phone).filter(e -> e.length()==10).distinct().collect(Collectors.collectingAndThen(
				Collectors.toList(),e -> { 
					Collections.shuffle(e);
					return e.stream();
		})).limit(1).forEach(e -> System.out.println(e));
	}
}

