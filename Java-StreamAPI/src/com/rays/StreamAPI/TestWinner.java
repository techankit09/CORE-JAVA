package com.rays.StreamAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TestWinner {
	
	public static void main(String[] args) {
		
		List<Winner> list = new ArrayList<Winner>();
				
				list.add(new Winner("Lucky"));
				list.add(new Winner("amit"));
				list.add(new Winner("Kunal"));
				list.add(new Winner("Uday"));
				list.add(new Winner("Anshul"));
				list.add(new Winner("Ankiy"));
               
				list.stream().map(e -> e.name ).distinct().collect(Collectors.collectingAndThen(
						Collectors.toList(),e -> { 
							Collections.shuffle(e);
							
							return e.stream();
				})).limit(1).forEach(e -> System.out.println(e));
			}
		}
	