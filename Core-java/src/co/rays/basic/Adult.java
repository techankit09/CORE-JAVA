package co.rays.basic;

import java.util.Scanner;

public class Adult {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age");
		int a = sc.nextInt();
		
				
	if (a >= 18){
		System.out.println("The user is Adult");
	}else if (a > 12 && a<17) {
		System.out.println("The user is teenager");
	
	}else if (a>5 && a < 12){
		System.out.println("This user is adolance");
		
	}else {
		System.out.println("The user is Minor");
	}
	
	}
}
