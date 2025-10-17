package com.ani.constructor_overloading;

// program on constructor overloading

class Addition
{
	public Addition(int x, int y)
	{
		this(55.5F,34.4f);
		System.out.println("Sum of two integer is :"+(x+y));
	}
	
	public Addition(float x, float y)
	{
		this("Data", " Base");
		System.out.println("Sum of two float is :"+(x+y));
	}
	
	public Addition(String x, String y)
	{
		super(); // added by compiler it goes to object class
		System.out.println("Sum of two String is :"+(x+y));
	}
}

public class OverloadingDemo1 
{
	public static void main(String[] args) 
	{
		new Addition(100,200);
	}

}
