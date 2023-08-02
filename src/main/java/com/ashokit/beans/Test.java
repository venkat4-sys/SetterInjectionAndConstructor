package com.ashokit.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		
	ApplicationContext ctx=new ClassPathXmlApplicationContext("Beans.xml");
	PaymentService paymentService = ctx.getBean(PaymentService.class);
	paymentService.doPayment(220.00);
	
	}

}
