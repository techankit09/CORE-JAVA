package com.rays.oop.Abstraction;

public class Businessman extends Person implements Richman , SocialWorker {

	
	@Override
	public void getHelptoOthers() {
		System.out.println("Help To Others");	
	}
	@Override
	public void getDonation() {
  System.out.println("Give some Donation");
	}
	@Override
	public void getMoney() {
	System.out.println("Give Money");	
	}
	@Override
	public void getParty() {
	System.out.println("Let's Party");
		
	}


}
