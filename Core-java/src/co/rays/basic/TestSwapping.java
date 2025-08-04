package co.rays.basic;

public class TestSwapping {
	
	public static void main(String[]args) {

	int a = 6;
	int b = 8;
	 
	System.out.println("before Swapping");
	System.out.println("a = "+ a +" "+"b = "+  b);
	
	a = a + b;
	b = a - b;
	a = a-b;
	
	System.out.println("After Swapping");
	System.out.println("a ="+ a +" "+" b= "+  b );
	
}
}
