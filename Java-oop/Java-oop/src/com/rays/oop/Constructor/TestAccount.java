package com.rays.oop.Constructor;

public class TestAccount {
	
	public static void main(String[]args) {
		
		Account a = new Account("58587587876","Saving",70000);
		
		System.out.println("Account No:" + a.getAccountNo()+ "\n" + "Account Type :" +a.getAccountType()+ "\n" + "Account Balance :"+a.getBalance());
	}

}
