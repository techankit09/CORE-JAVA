package com.rays.Thread;

public class TestHelloThread  {
	
	public static void main(String[] args) {
		
	HelloThread t1 = new HelloThread("Ankit");
    HelloThread t2 = new HelloThread("Lucky");
    
    
    t1.start();
    t2.start();
    t1.stop();
	}

}
