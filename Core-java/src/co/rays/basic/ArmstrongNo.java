package co.rays.basic;

public class ArmstrongNo {

	public static void main(String[] args) {

		int no = 157;
		int temp = no ;
	  int   r  = 0;
	  int sum  = 0;
	  
	  while ( temp > 0 ) {
		r = temp % 10;
	  sum = sum+ r*r*r;
	temp = temp / 10;
	  }
	
	if ( no == sum) {
		
		System.out.println("This no is Armstrong");
		
	}else {
		System.out.println("This no is not Armstrong");
	}
	}
		  
		  
	  }
