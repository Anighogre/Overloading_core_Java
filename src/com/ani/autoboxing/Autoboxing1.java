package com.ani.autoboxing;

public class Autoboxing1 
{
	public static void main(String[] args) 
	{
		
		// up to JDK 1.5 version
		int a = 12;
		Integer x = Integer.valueOf(a);
		System.out.println(x);
		
		// from JDK 1.5V onwards compiler take care
		int y = 15;
		Integer z = y;
		System.out.println(z);
	}

}
