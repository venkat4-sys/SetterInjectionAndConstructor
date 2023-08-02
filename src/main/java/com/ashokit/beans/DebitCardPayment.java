package com.ashokit.beans;

public class DebitCardPayment implements Ipayment{
	
	public DebitCardPayment() {
		System.out.println("debit card constructor::called");
	}
	
	public boolean processPayment(double amt) {
		System.out.println("Debit card payment successful");
		return true;
	}

}
