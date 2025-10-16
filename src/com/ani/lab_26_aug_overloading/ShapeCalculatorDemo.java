package com.ani.lab_26_aug_overloading;

public class ShapeCalculatorDemo 
{
	public static void main(String[] args) 
	{
		ShapeCalculator obj = new ShapeCalculator();
		
		System.out.println("Area of the Square :"+obj.calculateArea(9));
		System.out.println("Area of the Rectangle :"+obj.calculateArea(2,60));
		System.out.printf("Area of the Circle is : %.2f",obj.calculateArea(3.2));
		
	}

}
