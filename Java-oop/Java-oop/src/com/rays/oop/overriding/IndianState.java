package com.rays.oop.overriding;

	import java.util.Scanner;

	import java.util.Map;

	import java.util.HashMap;

	public class IndianState {
		
		    public static void main(String[] args) {

		        HashMap<String, String> stateCapitals = new HashMap<>();
		        
		        
		        stateCapitals.put("Andhra Pradesh", "Amaravati");
		        stateCapitals.put("Arunachal Pradesh", "Itanagar");
		        stateCapitals.put("Assam", "Dispur");
		        stateCapitals.put("Bihar", "Patna");
		        stateCapitals.put("Chhattisgarh", "Raipur");
		        stateCapitals.put("Goa", "Panaji");
		        stateCapitals.put("Gujarat", "Gandhinagar");
		        stateCapitals.put("Haryana", "Chandigarh");
		        stateCapitals.put("Himachal Pradesh", "Shimla");
		        stateCapitals.put("Jharkhand", "Ranchi");
		        stateCapitals.put("Karnataka", "Bengaluru");
		        stateCapitals.put("Kerala", "Thiruvananthapuram");
		        stateCapitals.put("Madhya Pradesh", "Bhopal");
		        stateCapitals.put("Maharashtra", "Mumbai");
		        stateCapitals.put("Manipur", "Imphal");
		        stateCapitals.put("Meghalaya", "Shillong");
		        stateCapitals.put("Mizoram", "Aizawl");
		        stateCapitals.put("Nagaland", "Kohima");
		        stateCapitals.put("Odisha", "Bhubaneswar");
		        stateCapitals.put("Punjab", "Chandigarh");
		        stateCapitals.put("Rajasthan", "Jaipur");
		        stateCapitals.put("Sikkim", "Gangtok");
		        stateCapitals.put("Tamil Nadu", "Chennai");
		        stateCapitals.put("Telangana", "Hyderabad");
		        stateCapitals.put("Tripura", "Agartala");
		        stateCapitals.put("Uttar Pradesh", "Lucknow");
		        stateCapitals.put("Uttarakhand", "Dehradun");
		        stateCapitals.put("West Bengal", "Kolkata");

		     
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter the name of an Indian state: ");
		        String state = sc.nextLine();

		       
		        if(stateCapitals.containsKey(state)) {
		            System.out.println("The capital of " + state + " is " + stateCapitals.get(state));
		        } else {
		            System.out.println("Sorry! State not found in the list.");
		        }

		        sc.close();
		    }
		};
		  
			
		


