package com.ani.constructor_overloading;

/*
 * Method overloading by changing the return type
 */

class Sum
{
	public int add(int x, int y)
	{
		return x+y;
	}
	
	public float add(float x, float y)
	{
		return x+y;
	}
	
	public String add(String x, String y)
	{
		return x+y;
	}
}

public class OverloadingDemo2 
{
	public static void main(String[] args) 
	{
		Sum sum = new Sum();
		System.out.println("sum of two integer is :"+sum.add(12, 12));
		System.out.println("Sum of two float is :"+sum.add(12.3f, 12.9f));
		System.out.println("Sum of two string is :"+sum.add("Java", " Technology"));
	}

}
