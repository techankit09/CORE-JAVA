package com.rays.oop.Abstraction;

public class TestBusinessman {
	
	public static void main(String[] args) {
		
		Richman r = new Businessman();
		
		r.getMoney();
		r.getDonation();
		r.getParty();
		
		SocialWorker s = new Businessman();
		
		s.getHelptoOthers();
		
		Businessman bm = new Businessman();
		
		bm.getName();
	}

}
