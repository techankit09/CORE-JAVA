package co.rays.basic;

import java.util.Scanner;

public class TestArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
			System.out.println("Enter No");
			
			int a = sc.nextInt();
			
			int [] n = {24,57,59,73,89,47,34,78,90,45,87,0,109};
			int  position = 0;
			for( int i = 0 ; i < n.length ; i++){
		
				if (n[i]==a) {
				position = i ;
				
				System.out.println("The Index Position is :"+ position+ "\n " + "The No is :" + n[i]);
			   
	    }
			sc.close();
}
}
}