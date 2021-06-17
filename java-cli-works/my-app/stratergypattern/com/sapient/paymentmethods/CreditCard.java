package com.sapient.paymentmethods;

import com.sapient.contracts.PaymentStratergy;

public class CreditCard implements PaymentStratergy {

	private String name; 
	private String creditCardNo; 
	private int cvv; 
	private String dateOfExpiry; 
	private static double charges = 1.5; 
	
	public static double getCharges() {
		return charges; 
	}
	
	
	public CreditCard() {
		this.name ="Priyadarshan-Citi";; 
		this.creditCardNo="3434-4545-6665-6754"; 
		this.cvv  = 123; 
		this.dateOfExpiry = "05/2024"; 
	}
	
	public CreditCard(String name, String creditCardNo, int cvv, String dateOfExpiry) {
		super();
		this.name = name;
		this.creditCardNo = creditCardNo;
		this.cvv = cvv;
		this.dateOfExpiry = dateOfExpiry;
	}



	@Override
	public void pay(int amount) {
		System.out.println("=========================================");
		System.out.println("Paying with Credit Card ");
		System.out.println("Name : "+ this.name);
		System.out.println("Credit Cart No " + this.creditCardNo);
		System.out.println("CVV "+ this.cvv);
		System.out.println("Date Of Expiry " + this.dateOfExpiry);
		System.out.println("=========================================");
		
	}
	
}
