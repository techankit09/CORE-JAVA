package com.rays.Thread;

public class Account {

	private int balance;

	public int getBalance() throws InterruptedException {
		Thread.sleep(200);
		return balance;
	}

	public void setBalance(int balance) throws InterruptedException {
		Thread.sleep(200);
		this.balance = balance;
}
	public synchronized void Deposit(String name, int amount) throws InterruptedException {
		
		int bal = getBalance();
		    bal = bal + amount;
		    setBalance(bal);
		    
	System.out.println(name + " "+" new Balance"+  " "+  getBalance());

}
	}


