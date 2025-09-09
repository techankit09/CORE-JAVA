package com.rays.Thread;

public class HelloRunnable implements Runnable {
	
	private String Name;
	
	public HelloRunnable(String name) {
		this.Name = Name;
	}
	
	@Override
	public void run() {
	for(int i = 1; i<= 50; i++) {
		
		System.out.println(i +"="+ Name);
	}
	
	}

}
