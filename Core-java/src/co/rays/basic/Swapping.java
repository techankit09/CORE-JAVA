package co.rays.basic;

public class Swapping {

	public static void main(String[]args) {
		
		int a = 5;
		int b = 15;
		
		System.out.println("before swapping");
		System.out.println("a = "+ a +" "+"b = "+  b);
	   a = a+b;
	   b = a-b;
	   a = a - b;
	 
	 System.out.println("After Swapping");
	 System.out.println("a = " + a +" "+"b = "+  b);
	    
	 
				
	}
}