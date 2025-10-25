package com.ani.var_args;

/*
 * var args can accept array and direct values
 */

class ArrayAndValues
{
	public void accept(int ...arr)
	{
		for(int x : arr)
		{
			System.out.println(x);
		}
	}
}
public class VarArgsDemo3 
{
	public static void main(String[] args) 
	{
		ArrayAndValues a1 = new ArrayAndValues();
		int [] values  = {12,90,67,45};
		a1.accept(values);
		
		System.out.println("--------------------------");
		a1.accept(10,20,30,40);
	}

}
