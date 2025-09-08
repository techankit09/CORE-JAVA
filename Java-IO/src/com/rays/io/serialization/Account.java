package com.rays.io.serialization;

import java.io.Serializable;

public class Account implements Serializable{
	
	public String AccountNo;
    public transient  Double Balance;
    
    public Account ( String n,  Double b) {
           this.AccountNo = n;
           this.Balance = b;
    }
           public String toString() {
        	   return "Account No:" + AccountNo + "Balance:" + Balance;
           }
           
        
    
       
  }

