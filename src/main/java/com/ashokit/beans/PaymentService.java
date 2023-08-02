package com.ashokit.beans;

public class PaymentService {

	private Ipayment ipayment;

	PaymentService() {

		System.out.println("payment service constructor::called");

	}

	// constructor injection
	public PaymentService(Ipayment ipayments) {
		this.ipayment = ipayments;

	}

	
	
      //setter injection
	public void setIpayment(Ipayment ipayment) {
		this.ipayment = ipayment;
	}

	public void doPayment(double amt) {

		boolean status = ipayment.processPayment(amt);

		if (status) {
			System.out.println("Recipt printing..");
		} else {
			System.out.println("card declined..");
		}

	}

}
