package com.ashokit.beans;

public class CreditCardPayment implements Ipayment{
	public CreditCardPayment() {
		System.out.println("creditcard constructor:: called");
	}
	
	public boolean processPayment(double amt) {
		System.out.println("credit card payment sucessful");
		return true;
	}

}
