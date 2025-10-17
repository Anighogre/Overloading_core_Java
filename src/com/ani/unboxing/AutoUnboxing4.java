package com.ani.unboxing;

/*
 * unlike primitive types we cant convert one wrapper object to another wrapper object
 */

public class AutoUnboxing4 
{
	public static void main(String[] args)
	{
//		Long l1 = 12; // error invalid
//		Float f1 = 123; // invalid
//		Double d1 = 12; // invalid
		
		long x = 12; // widening or automatic type casting
		System.out.println(x);
		
		Long a = 12L;
		System.out.println(a);
		
		Double b = 12.2;
		System.out.println(b);
		
		Double c = 234D;
		System.out.println(c);
		
		Float d = 132f;
		System.out.println(d);
		
	}

}
