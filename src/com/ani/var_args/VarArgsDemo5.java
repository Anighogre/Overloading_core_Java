package com.ani.var_args;

/*
 * var args must be only one and last parameter
 */


class Sample
{
	/*
	 * All comments line are invalid 

	public void displaySample(int ...x, int ...y)
	{
		
	}
	
	public void diapplaySample(int ...x, int ...y)
	{
		
	}

	
	public void diapplaySample(int ...x, float ...y)
	{
		
	}
	*/
	
	// valid because var args must be only one and last parameter
	
	public void diapplaySample(int x, int ...y)
	{
		System.out.println("X value is :"+x);
		for(int z : y)
		{
			System.out.println(z);
		}
	}
}

public class VarArgsDemo5 
{

	public static void main(String[] args) 
	{
		Sample s1 = new Sample();
		int arr[] = {200,300,400,500};
		
		s1.diapplaySample(100, arr);
	}

}
