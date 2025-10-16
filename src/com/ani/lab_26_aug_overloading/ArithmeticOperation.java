package com.ani.lab_26_aug_overloading;

public class ArithmeticOperation 
{
	public static void main(String[] args) 
	
	{
		Calculator c1 = new Calculator();
		System.out.println("Sum of two integer is :"+c1.add(15, 21));
		System.out.println("Sum of two double is :"+c1.add(15.5, 22.4));
		
		System.out.println("-------------------------");
		System.out.println("Multiplication of two integer is :"+c1.multiply(2, 36));
		System.out.println("Multiplication of two double is :"+c1.multiply(3.0, 2.20));
	}

}
