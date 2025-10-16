package com.ani.lab_26_aug_overloading;

public class ShapeCalculator 
{
	private static final double PI = 3.14;
	
	public int calculateArea(int side)
	{
		return side * side;
	}
	
	public int calculateArea(int length, int width)
	{
		return length * width;
	}
	
	public double calculateArea(double radius)
	{
		return PI * radius * radius;
	}
}
