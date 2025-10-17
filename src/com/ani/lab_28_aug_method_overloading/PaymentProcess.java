package com.ani.lab_28_aug_method_overloading;

import java.util.Scanner;

public class PaymentProcess 
{
	public static void main(String[] args)
	{
		System.out.println("Payment Menu");
		System.out.println("Please select any one Payment Method from the Menu :");
		System.out.println("\t\t 1) Payment by using Cash ");
		System.out.println("\t\t 2) Payment by using Credit Card ");
		System.out.println("\t\t 3) Payment by using Debit Card ");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your Payment choice [1/2/3]");
		int n = Integer.parseInt(sc.nextLine());
		Payment p1 = new Payment();
		
		switch(n) {
		case 1 -> {
			System.out.print("Enter the amount you want to pay through cash :");
			double amount = Double.parseDouble(sc.nextLine());
			p1.makePayment(amount);
		}
		
		case 2 -> {
			System.out.print("Enter your name :");
			String name = sc.nextLine();
			
			System.out.print("Enter your 16 digit Credit Card Number :");
			String cNumber = sc.nextLine();
			
			System.out.print("Enter your Payment Amount :");
			double amount = Double.parseDouble(sc.nextLine());
			
			p1.makePayment(name, cNumber, amount);
		}
		
		case 3 ->
		{
			System.out.print("Enter your 16 digit Credit Card Number :");
			String cNumber = sc.nextLine();
			
			System.out.print("Enter your Payment Amount :");
			double amount = Double.parseDouble(sc.nextLine());
			
			p1.makePayment(cNumber, amount);
		}
		}
	}

}
