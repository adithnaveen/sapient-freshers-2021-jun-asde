package com.sapient.payment;

import com.sapient.contracts.PaymentStratergy;
import com.sapient.paymentmethods.CreditCard;
import com.sapient.paymentmethods.UPI;

public class BestPayment {
	
	// you you want to pass credit card or UPI information you do so 
	
	public PaymentStratergy bestPay(String ... args) {
		return CreditCard.getCharges() < UPI.getCharges() ? 
				new CreditCard(args[0],args[1], Integer.parseInt(args[2]), args[3]) 
				: new UPI(args[0], Integer.parseInt(args[1])); 
	}
	
	
	public PaymentStratergy bestPay() {
		return CreditCard.getCharges() < UPI.getCharges() ? 
					new CreditCard() : new UPI(); 
	}
}
