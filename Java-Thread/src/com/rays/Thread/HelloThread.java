package com.rays.Thread;

public class HelloThread extends Thread{
	
	public String Name;
	
	public HelloThread(String Name) {
		this.Name = Name;
	}
	
	@Override
	public void run() {
		for(int i = 1; i <= 5; i++) {
		
		System.out.println(i + "=" + Name);
	}
	
}
}
