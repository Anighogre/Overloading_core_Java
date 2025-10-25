package com.ani.var_args;

/*
 * How to add arguments of a method parameter using var args
 */

class Addition
{
	public void addParameterValue(int ...values)
	{
		int sum = 0;
		for(int value : values)
		{
			sum = sum+value;
		}
		System.out.println("Sum of parameter is :"+sum);
	}
	
}

public class VarArgsDemo2 {

	public static void main(String[] args) {
		Addition a1 = new Addition();
		a1.addParameterValue(0);
		a1.addParameterValue(10);
		a1.addParameterValue(10,20);
		a1.addParameterValue(10,20,30);
		a1.addParameterValue(10,20,30,40);
		a1.addParameterValue(10,20,30,40,50);
	}

}
