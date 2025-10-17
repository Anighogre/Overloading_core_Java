package com.ani.lab_28_aug_method_overloading;

public class Payment 
{
	public void makePayment(double amount)
	{
		if(validateAmount(amount)) {
		System.out.println("Processing payment via Cash...");
		System.out.println("Amount Paid RS :"+amount);
		System.out.println("Payment Successful!");
		}
		
	}
	
	private boolean validateAmount(double amount)
	{
		if(amount> 0)
		{
			return true;
		} else {
			System.err.println("Amount can not be negative");
			return false;
		}
		
	}
	
	public void makePayment(String cardHolderName, String creditCardNumber,double amount)
	{
		if(validateCardNumber(creditCardNumber)) {
		String last  = "****_****_****_"+creditCardNumber.substring(12);

		System.out.println("Processing payment via Credit Card...");
		System.out.println("Card Holder: "+cardHolderName);
		System.out.println("Card Number: "+last);
		System.out.println("Amount Paid RS :"+amount);
		System.out.println("Payment Successful!");
		} 
		
	}
	
	private boolean validateCardNumber(String creditCardNumber)
	{
		
		if(creditCardNumber.length() != 16){
			System.err.println("Invalid card number. It must be 16 digits.");
			System.exit(0);
			return false;
		} else return true;
		
		
		
	}
	
	public void makePayment(String debitCardNumber, double amount)
	{
		if(maskCardNumber(debitCardNumber)) {
		String last  = "****_****_****_"+debitCardNumber.substring(12);
		
		System.out.println("Processing payment via Debit Card...");
		System.out.println("Card Number: "+last);
		System.out.println("Amount Paid RS :"+amount);
		System.out.println("Payment Successful!");
		}
	}
	
	private boolean maskCardNumber(String debitCardNumber)
	{
		
		if(debitCardNumber.length() != 16 )
		{
			System.err.println("Invalid card number. It must be 16 digits.");
			System.exit(0);
			return false;
		} else return true;
		
	}
	
	
}
