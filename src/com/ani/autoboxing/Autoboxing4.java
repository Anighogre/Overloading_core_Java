package com.ani.autoboxing;

public class Autoboxing4 
{
	public static void main(String[] args) 
	{
		
		/* i and j reference variables both are pointing to same object(immutable) so == operator
		   will provide true */
		Integer i = 127;
		Integer j = 127;
		System.out.println(i==j); // true because Integer objects are immutable
		
		Integer x = 128;
		Integer y = 128;
		System.out.println(x==y); // false bcz Integer class cache memory value is upto 127
		
		Integer p = 255;
		Integer q = 255;
		System.out.println(p.equals(q));
		
		/*
		 * While working with wrapper classes and it is strongly recommended to use equal(Object obj)
		 * method for comparison
		 * 
		 * Integer class has provided cache memory value upto 127 so if we compare to Integer Object
		 * by using == operator upto 127 we will get true, if we compare beyond 127 then we will get false
		 */
		
		
	}

}
