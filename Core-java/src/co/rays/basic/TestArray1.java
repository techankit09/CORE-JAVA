package co.rays.basic;

import java.util.Scanner;

public class TestArray1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter No");
		
		int a = sc.nextInt();

		int[] n = { 56, 57, 38, 85, 24, 69, 47,57,78,60,34,46,23, };
   int position = 0;
		
   for ( int i= 0; i < n.length;i++) {
	   
	   if (n[i]==a) {
		position = i ;
	   
		
		System.out.println("The Index Position is :"+ position+ "\n " + "The No is :" + n[i]);
	   }
   }
     
		
		
}
	}

