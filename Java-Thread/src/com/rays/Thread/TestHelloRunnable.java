package com.rays.Thread;

public class TestHelloRunnable {
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new HelloRunnable("Ankit"));
		Thread t2 = new Thread(new HelloRunnable("Lucky"));
		
		t1.start();
		t2.start();
		
	}

}
