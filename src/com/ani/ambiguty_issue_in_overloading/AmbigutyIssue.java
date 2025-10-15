package com.ani.ambiguty_issue_in_overloading;

class Test{
	public void accept(double d)
	{
		System.out.println("double");
	}
	
	public void accept(float f)
	{
		System.out.println("float");
	}
}

public class AmbigutyIssue 
{
	public static void main(String[] args) 
	{
		Test t1 = new Test();
		t1.accept(6);
	}

}

/*
 * Here float will be executed because float is the most specific type
 */
