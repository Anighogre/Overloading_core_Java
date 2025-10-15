package com.ani.autoboxing;

public class Autoboxing3 
{
	public static void main(String[] args) 
	{
		// Integer.valueOf(String str); // It will convert the given string into integer object
		// Integer.valueOf(String str,int radix/base); // It will convert the given string into integer 
													   //object by using the specified radix or base
		
		Integer a = Integer.valueOf(15);
		
		// It will convert the given string into integer object
		Integer b = Integer.valueOf("25");
		
		// It will convert the given string into integer object by using the specified radix or base
		Integer c = Integer.valueOf("111",36);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
	}

}
