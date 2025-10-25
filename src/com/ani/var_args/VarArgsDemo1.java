package com.ani.var_args;

/*
 * var args can accept 0 to n nmber of parameters
 */

class Test
{
	public void input(int ...x)
	{
		System.out.println("Executed");
	}
}

public class VarArgsDemo1 
{
	public static void main(String[] args)
	{
		Test t1 = new Test();
		t1.input();
		t1.input(10);
		t1.input(10,20);
		t1.input(10,20,30);
		t1.input(10,20,30,40);
	}
}
