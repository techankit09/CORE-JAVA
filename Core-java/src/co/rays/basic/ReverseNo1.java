package co.rays.basic;

import java.util.Scanner;

public class ReverseNo1 {

	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No");
		int no = sc.nextInt();
		
		
		int r  = 0;
		int sum= 0;
		
		while (no  > 0) {
			r = no % 10;
			sum= (sum*10)+ r;
			no = no / 10;
		}
			
			System.out.println("Reverse No is:"+sum);
		}
	}
	

