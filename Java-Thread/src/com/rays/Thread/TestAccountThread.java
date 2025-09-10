package com.rays.Thread;

public class TestAccountThread {

	public static void main(String[] args) {

		AccountThread t1 = new AccountThread("Ankit");
		AccountThread t2 = new AccountThread("Lucky");
		
		t1.start();
		t2.start();

	}

}
