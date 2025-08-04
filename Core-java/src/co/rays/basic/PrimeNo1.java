package co.rays.basic;

import java.util.Scanner;

public class PrimeNo1 {

	public static void main(String[]args) {
		
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter No");
	
		 
		int no = sc.nextInt();
		int count = 0;
      int    i  = 2;
    while(i < no){
   if ( no % i == 0) {
			count++;
    	}
    	  i++;
      }
    
    if (count>0) {
    	System.out.println("This is not  Prime");
    	
    }else {
    	System.out.println("This is  Prime");
    
   
    }
	}
	}

