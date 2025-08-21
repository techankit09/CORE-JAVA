package com.rays.encapsulation;

public class TestAccount {

	public static void main(String[]args) {
		
		Account a = new Account();
		
		a.setAccNumber("73598357575377");
		a.setAccType("Saving");
		a.setBalance(10000.0);
		
		System.out.println("Account No:" + a.getAccNumber());
		System.out.println("Your Account Type:" + a.getAccType());
		System.out.println("Your Account Balance:" + a.getBalance());
		a.deposit(100000);
		a.withdrawal(60000);
	}
}
