package com.sapient.paymentmethods;

import com.sapient.contracts.PaymentStratergy;

public class UPI implements PaymentStratergy {

	private String mobileNumber; 
	private int otp; 
	private static double charges = 1.3; 
	
	public static double getCharges() {
		return charges; 
	}
	
	public UPI() {
		this.mobileNumber = "9900524255"; 
		this.otp = 123; 
	}
	
	
	
	public UPI(String mobileNumber, int otp) {
		super();
		this.mobileNumber = mobileNumber;
		this.otp = otp;
	}

	@Override
	public void pay(int amount) {
	System.out.println("----------------------------------");
	System.out.println("Paying with UPI");
	System.out.println("Mobile No : " + this.mobileNumber);
	System.out.println("OTP " + this.otp);
	System.out.println("----------------------------------");		
	}
	
}
