package co.rays.basic;

import java.util.Arrays;
import java.util.Collections;

public class LargestNoUsingCollectionsMethod {
	
	public static void main(String[] args) {
		
		Integer [] a = {88,44,89,99,35,23,95,78,56,36,97};
		
		Arrays.sort( a, Collections.reverseOrder());
		
		for(int i = 0; i<3;i++) {
			
			System.out.println("Largest No is :" + a[i]);
		}
	
}
}
