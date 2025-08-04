package co.rays.basic;

import java.util.Scanner;

public class ARmstrongNo1 {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No");
		int no = sc.nextInt();
	
	  int temp=  no;
	  int  r  = 0;
	  int sum = 0;
	  
	  while ( temp> 0) {
		  r = temp % 10;
		 sum= sum + r * r * r;
		temp= temp/10;
		
		
	}
	  
	  if (no  == sum) {
			System.out.println("This No is Armstrong No :");
	  }else {
		  System.out.println("This No is Not Armstrong No :");
		}
	}

}